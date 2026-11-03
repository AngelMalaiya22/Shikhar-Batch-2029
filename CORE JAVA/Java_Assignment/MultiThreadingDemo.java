// Question 6
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread Class Thread: Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable Interface Thread: Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}