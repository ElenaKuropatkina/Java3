package MFU;

import java.io.File;

public class Start {

    public static void main(String[] args) {

        Clients client1 = new Clients(new File("Files/file1.txt"), "copy");
        Clients client2 = new Clients(new File("Files/file2.txt"), "scan");
        Clients client3 = new Clients(new File("Files/file3.txt"), "print");
        Clients client4 = new Clients(new File("Files/file4.txt"), "scan");
        Clients client5 = new Clients(new File("Files/file5.txt"), "scan");
        Clients client6 = new Clients(new File("Files/file6.txt"), "print");
        Clients client7 = new Clients(new File("Files/file7.txt"), "copy");
        Clients client8 = new Clients(new File("Files/file8.txt"), "scan");

    }

}
