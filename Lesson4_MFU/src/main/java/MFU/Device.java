package MFU;

import java.io.*;

public class Device {

    Object printLock = new Object();
    Object scanLock = new Object();

    public void print(File file){
        synchronized (printLock) {
            System.out.println("Начало печати");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Печать из файла " + file.getName() + ": " + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Конец печати");
        }
    }

    public void copy(){
        synchronized (scanLock) {
            synchronized (printLock) {
                System.out.println("Начало копирования");
                String line = "copy";
                System.out.println("Скопировано: " + line);
                System.out.println("Конец копирования");
            }
        }
    }

    public void scan(File file) {
        synchronized (scanLock) {
            System.out.println("Начало сканирования");
            String line = "scan";
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(line);
                writer.flush();
                System.out.println("Сканирование завершено. Проверьте файл " + file.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
