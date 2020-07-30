package ru.chat.server.core;

import ru.chat.library.Library;
import ru.chat.network.SocketThread;
import ru.chat.network.SocketThreadListener;

import java.net.Socket;

// Класс, в котором реализуется возможность отличия авторизованных пользователей
// от не авторизованных
public class ClientThread extends SocketThread {

    private String nickname;
    private boolean isAuthorized;
    private boolean isReconnecting;

    public ClientThread(SocketThreadListener listener, String name, Socket socket) {
        super(listener, name, socket);
    }

    public String getNickname() {
        return nickname;
    }

    // флаг авторизации
    public boolean isAuthorized() {
        return isAuthorized;
    }

    public boolean isReconnecting() {
        return isReconnecting;
    }

    // Переподсоединение зарегистрированного клиента
    void reconnect() {
        isReconnecting = true;
        close();
    }

    public void authAccept(String nickname) {
        isAuthorized = true;
        this.nickname = nickname;
        sendMessage(Library.getAuthAccept(nickname));
    }

    // неудачная авторизация
    public void authFail() {
        sendMessage(Library.getAuthDenied());
        close();
    }

    public void msgFormatError(String msg) {
        sendMessage(Library.getMsgFormatError(msg));
        close();
    }


}
