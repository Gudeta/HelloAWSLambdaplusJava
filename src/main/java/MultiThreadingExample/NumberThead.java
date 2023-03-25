package MultiThreadingExample;

public class NumberThead implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=10;i++){
            System.out.print(i+ " ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
