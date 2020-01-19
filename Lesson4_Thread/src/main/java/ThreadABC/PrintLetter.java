package ThreadABC;

public class PrintLetter {
    private char letter = 'A';

    public void printA() {
        synchronized (this) {
            try {
                for (int j = 0; j < 5; j++) {
                    while (letter != 'A') {
                        wait();
                    }
                    System.out.print('A');
                    letter = 'B';
                    notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void printB() {
        synchronized (this) {
            try {
                for (int j = 0; j < 5; j++) {
                    while (letter != 'B') {
                        wait();
                    }
                    System.out.print("B");
                    letter = 'C';
                    notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void printC() {
        synchronized (this) {
            try {
                for (int j = 0; j < 5; j++) {
                    while (letter != 'C') {
                        wait();
                    }
                    System.out.print("C");
                    letter = 'A';
                    notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}





