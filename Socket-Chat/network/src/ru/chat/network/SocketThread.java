package ru.chat.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// Класс предназначен для создания сокетов и отправки сообщений
public class SocketThread extends Thread {

    private Socket socket;
    private SocketThreadListener listener;
    private DataOutputStream out;

    public SocketThread(SocketThreadListener listener, String name, Socket socket) {
        super(name);
        this.socket = socket;
        this.listener = listener;
        start();
    }

    @Override
    public void run() {
        try {
            listener.onSocketStart(this, socket);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            // Все, кто может взаимодействовать с SocketThread, будут знать,
            // что можно взаимодействовать после вызова метода onSocketReady()
            listener.onSocketReady(this, socket);
            while (!isInterrupted()) {
                String msg = in.readUTF();
                listener.onReceiveString(this, socket, msg);
            }
        } catch (IOException e) {
            listener.onSocketException(this, e);
        } finally {
            // вызов метода close() для закрытия сокета
            close();
            listener.onSocketStop(this);
        }
    }
    // метод синхронизирован,
    // т.к. много клиентов может подключиться к серверу
    // и пользоваться этим методом
    public synchronized boolean sendMessage(String msg) {
        try {
            out.writeUTF(msg);
            // Метод flush() сбрасывает все, что буферизуется с помощью OutputStream
            out.flush();
            return true;
        } catch (IOException e) {
            listener.onSocketException(this, e);
            close();
            return false;
        }
    }
    // "synchronized" в данном случае предотвращает закрытие
    // всех клиентов при закрытии одного
    public synchronized void close() {
        try {
            out.close();
        } catch (IOException e) {
            listener.onSocketException(this, e);
        }
        interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            listener.onSocketException(this, e);
        }
    }

}
