package MFU;

import java.io.*;
import java.util.Scanner;

public class Device {

    public void print(File file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println("Печать из файла " + file.getName() + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void copy(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст для копирования");
//        String line = scanner.nextLine();
        String line = "Копирование";
        System.out.println(line);

    }

    public void scan(File file) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст для сканирования");
//        String line = scanner.nextLine();
        String line = "Сканирование";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(line);
            writer.flush();
            System.out.println("сканирование завершено. Проверьте файл " + file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
