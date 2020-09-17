package ru.learning.basepatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");

        User user1 = new SimpleUser(chat, "Timur");
        User user2 = new SimpleUser(chat, "Rone");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sengMsg("Hello!, I'm user Timur");
        admin.sengMsg("Hello, guys! I'm Admin");
    }
}
