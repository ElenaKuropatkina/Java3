package MFU;

import java.io.File;

public class Start_version2 {
    public static void main(String[] args) {
        Device mfu = new Device();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.copy();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(new File("Files/file2.txt"));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print(new File("Files/file3.txt"));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(new File("Files/file4.txt"));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(new File("Files/file5.txt"));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print(new File("Files/file6.txt"));
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.copy();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(new File("Files/file8.txt"));
            }
        }).start();
    }

}
