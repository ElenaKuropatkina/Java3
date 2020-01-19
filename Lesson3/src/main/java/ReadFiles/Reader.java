package ReadFiles;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public static int n = 1800;  // Количество символов на одной странице

    public static void main(String[] args) {
        File file = new File("MyFiles/fileForRead.txt");  // Небольшой файл, но с разбивкой на страницы, чтобы было видно, что программа работает корректно
        File bigFile = new File("MyFiles/file10Mb.txt");  // Файл больше 10MB
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер страницы (с 1 по 16)");
        int str = scanner.nextInt();
        read(file, str);
        System.out.println();
        System.out.println("Введите номер страницы большого файла");
        str = scanner.nextInt();
        long a = System.currentTimeMillis();
        read(bigFile, str);
        System.out.println();
        System.currentTimeMillis();
        System.out.println("Время чтения: " + (System.currentTimeMillis() - a));

    }

    public static void read(File f, int str) {

        try (RandomAccessFile raf = new RandomAccessFile(f, "r")) {
            raf.seek((str * n - n));
            byte[] buffer = new byte[n];
            raf.read(buffer);
            System.out.print(new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
