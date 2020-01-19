package Serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server = null;
    Socket socket = null;

    void initServer() {

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен");

            socket = server.accept();
            System.out.println("Клиент подключен");

            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            MyObject objAfter = (MyObject)in.readObject();
            System.out.println("Объект после десериализации: " + objAfter.printObj());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}