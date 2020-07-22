package ru.gb.jtwo.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        // блок try c ресурсами автоматически закроет ресуры в блоке
        try (ServerSocket serverSocket = new ServerSocket(8189);
             Socket socket = serverSocket.accept()) {

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Client connected...");

            while (true) {
                String str = in.readUTF();
                System.out.println("Client sent a message: " + str);
                out.writeUTF("echo: " + str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
