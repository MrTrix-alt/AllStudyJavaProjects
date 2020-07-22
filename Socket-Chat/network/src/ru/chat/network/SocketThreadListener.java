package ru.chat.network;

import java.net.Socket;

public interface SocketThreadListener {

    // Создание сокета
    void onSocketStart(SocketThread thread, Socket socket);
    // Закрытие потока сокетов
    void onSocketStop(SocketThread thread);
    // Метод, сообщающий, что он готов к действиям
    void onSocketReady(SocketThread thread, Socket socket);
    // Получение информации
    void onReceiveString(SocketThread thread, Socket socket, String msg);
    // Выбрасывание исключений
    void onSocketException(SocketThread thread, Throwable throwable);

}

