package Server;

import java.sql.*;
import java.util.Date;

public class AuthService {
    private static Connection connection;
    private static Statement stmt;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:myDB.db");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void createLogs() throws SQLException {
//        stmt.executeUpdate("CREATE TABLE llogs (" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT," + "client TEXT , " + "operation TEXT, " + "date DATETIME)");
//    }
//
//    public static void insertLogs(String login, String operation) throws SQLException {
//        java.util.Date data = new Date();
//        stmt.executeUpdate("INSERT INTO llogs (client, operation, date) VALUES ( ' " + login + " ', ' "
//                + operation + " ', '" + data + " ' )");
//    }
    public static String getNickByLoginAndPass(String login, String pass) {
        try{
            ResultSet rs = stmt.executeQuery("SELECT nickname, password FROM usersHash WHERE login = '" + login + "'");
            int userHash = pass.hashCode();
            if(rs.next()) {
                String nick = rs.getString(1);
                //System.out.println(nick);
                int dbHash = rs.getInt(2);
                //System.out.println(dbHash);
                if (dbHash == userHash) {
                    return nick;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String getLoginByNick(String nick) {
        try{
            ResultSet rs = stmt.executeQuery("SELECT login FROM usersHash WHERE nickname = '" + nick + "'");
            if(rs.next()) {
                String login = rs.getString(1);
                return login;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

