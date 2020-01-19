package ThreadABC;

public class StartThreadsABC{

    public static void main(String[] args) {
        PrintLetter pl = new PrintLetter();

        Thread ThreadA = new Thread(new Runnable() {
            @Override
            public void run() { pl.printA(); }
        });
        ThreadA.start();

        Thread ThreadB = new Thread(new Runnable() {
            @Override
            public void run() { pl.printB(); }
        });
        ThreadB.start();

        Thread ThreadC = new Thread(new Runnable() {
            @Override
            public void run() {
                pl.printC();
            }
        });
        ThreadC.start();
    }
}