package Demo01;

public class MyThread extends Thread {
    @Override
    public void run() {
        String threadName = getName();
        System.out.println(threadName);
        System.out.println("------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(threadName+": "+i);
        }
    }
}
