/// Synchronized block
import java.util.*;
class Display
{
    public synchronized void show(String msg)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello :"+msg);
        }
    }
}

class myThread extends Thread{
    Display d;
    String name;

    public myThread(Display d,String name)
    {
       
        this.d=d;
        this.name=name;
    }

    public void run()
    {
        
        d.show(name);
         System.out.println(Thread.currentThread().getName());
    }
    
}

class main{
    public static void main(String args[])
    {

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
          System.out.println(Thread.currentThread().getPriority());
        //   System.out.println(Thread.currentThread().getPriority());
Display d=new Display();
myThread t1=new myThread(d,"Srinivas");
myThread t2=new myThread(d,"venu");
myThread t3=new myThread(d,"mondaiah");
myThread t4=new myThread(d,"laxmi");
t1.start();
t2.start();
t3.start();
t4.start();
    }
}