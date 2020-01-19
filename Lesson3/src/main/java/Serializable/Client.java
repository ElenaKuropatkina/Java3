package Serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    Socket socket = null;

    void initClient() {
        try {
            socket = new Socket("localhost", 8189);
            System.out.println("Клиент подключен");

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            MyObject obj = new MyObject(15, 14.8, "Hello, world!");
            System.out.println("Объект до сериализации: " + obj.printObj());
            out.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
