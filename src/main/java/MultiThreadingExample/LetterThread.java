package MultiThreadingExample;

public class LetterThread implements Runnable{
    @Override
    public void run() {
        for(char c= 'a'; c<= 'j'; c++){
            System.out.print(c+" ");
            try {
                Thread.sleep(10000); //sleep for 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
