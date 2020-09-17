package ru.learning.basepatterns.behavioral.mediator;

public class Admin implements User {
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sengMsg(String msg) {
        chat.sendMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(this.name + " receiving message: " + msg + ".");
    }
}
