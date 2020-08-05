package multithreading.gbpart1;

public class Task {

    public static void main(String[] args) {
        System.out.println("TaskOne");
        new Thread(new WaitNotifyClass('A', 'B')).start();
        new Thread(new WaitNotifyClass('B', 'C')).start();
        new Thread(new WaitNotifyClass('C', 'A')).start();
    }
}

