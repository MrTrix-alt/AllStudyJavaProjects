package ru.learning.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMsg(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMsg(msg);
            }
        }
        admin.getMsg(msg);
    }
}
