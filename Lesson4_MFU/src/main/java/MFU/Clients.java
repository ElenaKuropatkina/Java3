package MFU;

import java.io.File;

public class Clients implements Runnable {

    Device mfu = new Device();
    Thread t;
    File file;
    String action;

    Clients(File file, String action) {
        this.file = file;
        this.action = action;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        switch (action) {
            case "print":
                mfu.print(file);
                break;
            case "scan":
                mfu.scan(file);
                break;
            case "copy":
                mfu.copy();
                break;
        }
    }
}





