package synchronizedTwoThread;

public class SynchronizedThread {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(new PrintThread(lock, true));
        Thread t2 = new Thread(new PrintThread(lock, false));
        t1.start();
        t2.start();
    }

    private static class PrintThread implements Runnable {
        private final Object lock;
        private boolean isThread1;
        private int count = 1;

        public PrintThread(Object lock, boolean isThread1) {
            this.lock = lock;
            this.isThread1 = isThread1;
        }

        public void run() {
            try {
                synchronized (lock) {
                    while (true) {
                        if ((isThread1 && count % 2 != 0) || (!isThread1 && count % 2 == 0)) {
                            if (isThread1) {
                                System.out.println("Thread 1=" + count);
                            } else {
                                System.out.println("Thread 2=" + (char) ('a' + count - 1));
                            }
                            count++;
                            lock.notify();
                        } else {
                            lock.wait();
                        }
                        if (count > 10) {
                            break;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}