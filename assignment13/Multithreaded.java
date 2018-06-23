
class Count {
    public void print(Thread t) {
        for(int i=1;i<=1000;i++) {
            System.out.println(t.getName()+" -> "+i);
        }
    }
}

class  RunnableImplementation implements Runnable{
    Thread t;
    Count c;

    public void instantiate(Thread t, Count c) {
        this.t = t;
        this.c = c;
    }
    public void run() {
        synchronized(c) {
            c.print(t);
        }
        System.out.println(t.getName()+" Exiting");
    }
}

public class Multithreaded {

    public static void main(String[] args) {
        Count c = new Count();
        RunnableImplementation t1 = new RunnableImplementation();
        Thread thread1 = new Thread(t1, "Thread1");
        t1.instantiate(thread1, c);
        System.out.println(thread1.getName()+" Starting");
        thread1.start();

        RunnableImplementation t2 = new RunnableImplementation();
        Thread thread2 = new Thread(t2, "Thread2");
        t2.instantiate(thread2, c);
        System.out.println(thread2.getName()+" Starting");
        thread2.start();
    }
}