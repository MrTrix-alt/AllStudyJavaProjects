package ru.learning.basepatterns.behavioral.mediator;

public class SimpleUser implements User {
    Chat chat;
    String username;

    public SimpleUser(Chat chat, String username) {
        this.chat = chat;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void sengMsg(String msg) {
        chat.sendMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(this.username + " receiving message: " + msg + ".");
    }
}
