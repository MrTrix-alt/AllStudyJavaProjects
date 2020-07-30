package ru.chat.network;

import java.net.ServerSocket;
import java.net.Socket;
// Сущность слушателя
public interface ServerSocketThreadListener {
    // Запуск сервера
    void onServerStarted(ServerSocketThread thread);
    // Создание сервера
    void onServerCreated(ServerSocketThread thread, ServerSocket server);
    // Ожидание сокета
    void onServerTimeout(ServerSocketThread thread, ServerSocket server);
    // Ожидание подключения
    void onSocketAccepted(ServerSocketThread thread, ServerSocket server, Socket socket);
    // Падение сервера
    void onServerException(ServerSocketThread thread, Throwable throwable);
    // Сервер выключился
    void onServerStop(ServerSocketThread thread);

}
