package org.awslambda;

public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " is running");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /* In this example, we define a class MyRunnable that implements the Runnable interface. This interface defines a run() method that contains the code that will be executed in a separate thread. We pass the name of the thread to the constructor of the MyRunnable class.

In the run() method, we use a for loop to print the name of the thread and the text "is running" five times, with a one-second delay between each iteration.

In the main() method, we create two instances of the MyRunnable class, and pass them to two separate instances of the Thread class. We then start both threads using the start() method.

When we run the Multithreading class, we will see the output from both threads running simultaneously, printing their name and "is running" text five times.*/

}
