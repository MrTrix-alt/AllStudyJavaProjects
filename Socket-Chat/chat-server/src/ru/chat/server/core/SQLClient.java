package ru.chat.server.core;

import java.sql.*;

public class SQLClient {

    private static Connection connection;
    private static Statement statement;

    synchronized static void connect() {
        // регистрация драйвера JDBC
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:chat-server/chat-db.sqlite");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized static String getNickname(String login, String password) {
        // получение данных из БД
        String query = String.format("select nickname from users where login='%s' and password='%s'", login, password);
        try (ResultSet set = statement.executeQuery(query)) {
            // проверка на существование записей в таблице
            if (set.next())
                // возвращаем колонку, если есть запись
                return set.getString(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // возвращаем null, если записи нет
        return null;
    }

    synchronized static void disconnect() {
        // закрытие соединения
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
