//package ReadFiles;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Enumeration;
//
//public class MyClass {
//
//    public static void main(String[] args) {
//        File file = new File("MyFiles/file.txt");
//        fileToByteArray(file);
//        reverseFile(file);
//        try {
//            fiveInOne();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void fileToByteArray(File file){
//        System.out.println("Размер считываемого файла составляет " + file.length() + " байт");
//        try (FileInputStream in = new FileInputStream(file)) {
//            byte[] arr = new byte[60];
//            int x;
//            while ((x = in.read(arr)) != -1) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void fiveInOne() throws IOException{
//        File bigFile = new File("MyFiles/bigFile.txt");
//        //bigFile.createNewFile();
//        ArrayList<InputStream> al = new ArrayList<>();
//
//        for(int i = 0; i < 5; i++){
//            String fileName = "MyFiles/file"+ (i + 1) +".txt";
//            File f = new File(fileName);
//            al.add(i, new FileInputStream(fileName));
//            System.out.println("Размер считываемого файла составляет " + f.length() + " байт"); // временная строка для проверки размера файла
//        }
//
//        Enumeration<InputStream> e = Collections.enumeration(al);
//        FileOutputStream out = new FileOutputStream(bigFile);
//
//        while(e.hasMoreElements()){
//            byte[] buffer = new byte[110];
//            int count;
//            while ((count = e.nextElement().read(buffer)) != -1 ) {
//                out.write(buffer, 0, count);
//                System.out.println("Размер полученного файла составляет " + bigFile.length() + " байт"); // временная строка для проверки размера файла
//            }
//            e.nextElement().close();
//        }
//
//        out.close();
//        System.out.println("Размер полученного файла составляет " + bigFile.length() + " байт"); // временная строка для проверки размера файла НЕ ОТРАБАТЫВАЕТ
//
//    }
//    public static void  reverseFile(File file) {
//
////        try (FileReader fileReader = new FileReader(file)){
////            char c[] = new char[(int) file.length()];
////            fileReader.read(c, 0, (int) file.length());
////            StringBuilder sb = new StringBuilder();
////            sb.append(c);
////            sb.reverse();
////            System.out.println(sb);
////
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
//            for (int i = 0; i <= file.length(); i++) {
//                raf.seek(file.length() - i);
//                System.out.print((char) raf.read());
//            }
//            System.out.println();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}


