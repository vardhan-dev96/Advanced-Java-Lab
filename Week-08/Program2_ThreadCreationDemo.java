class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread Class: " + i);
        }
    }
}

public class Program2_ThreadCreationDemo
{
    public static void main(String[] args)
    {
        MyRunnable runnableObj = new MyRunnable();
        Thread t1 = new Thread(runnableObj);

        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println("Main Thread");
    }
}