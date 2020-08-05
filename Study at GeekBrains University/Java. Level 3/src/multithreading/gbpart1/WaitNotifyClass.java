package multithreading.gbpart1;

public class WaitNotifyClass implements Runnable {
    static char ch = 'A';
    static Object obj = new Object();
    private char currentLetter;
    private char nextLetter;

    public WaitNotifyClass(char currentLetter, char nextLetter) {
        this.currentLetter = currentLetter;
        this.nextLetter = nextLetter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (obj) {
                try {
                    while (ch != currentLetter)
                        obj.wait();
                    System.out.print(currentLetter);
                    ch = nextLetter;
                    obj.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}