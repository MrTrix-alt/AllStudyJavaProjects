package ru.chat.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

// Создание сервера
public class ServerSocketThread extends Thread {

    private final int port;
    private final int timeout;
    // Сущность (интерфейс), которой отдаем сокет
    // ChatServer будет реализовывать этот интерфейс
    ServerSocketThreadListener listener;

    public ServerSocketThread(ServerSocketThreadListener listener, String name, int port, int timeout) {
        // Вызов конструтора из родительского класса Thread, передавая ему имя
        super(name);
        this.port = port;
        this.timeout = timeout;
        this.listener = listener;
        start();
    }

    @Override
    public void run() {
        // Генерация событий на сервере
        listener.onServerStarted(this);
        try (ServerSocket server = new ServerSocket(port)) {
            // Тайм-аут периодически отпускает accept() без подключения сокета
            server.setSoTimeout(timeout);
            listener.onServerCreated(this, server);
            // Через некоторые промежутки времени будем проверять условие в цикле
            while (!isInterrupted()) {
                Socket socket;
                try {
                    socket = server.accept();
                } catch (SocketTimeoutException e) {
                    listener.onServerTimeout(this, server);
                    // Если не произошло тайм-аута, сообщаем listener, что появился сокет
                    continue;
                }
                // Соообщаем о создании сокета socket
                listener.onSocketAccepted(this, server, socket);
            }
        } catch (IOException e) {
            listener.onServerException(this, e);
            // Необходимо обязательно останавливать сервер при ошибке
        } finally {
            listener.onServerStop(this);
        }
    }
}
