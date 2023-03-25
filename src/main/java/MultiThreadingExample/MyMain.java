package MultiThreadingExample;

public class MyMain {
    public static void main(String[] args) {
        LetterThread letterThread=new LetterThread();
        NumberThead numberThead=new NumberThead();
        Thread t1=new Thread(numberThead);
        Thread t2 =new Thread(letterThread);
        t1.start();
        t2.start();
    }
}
