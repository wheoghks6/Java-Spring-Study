package Thread_Priority;

public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of th1(-) : "+th1.getPriority());
        System.out.println("Priority of th2(|) : "+th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadEx8_1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.print("-");
            for(int x=0; x < 10000000; x++);
        }
    }
}

class ThreadEx8_2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.print("|");
            for(int x=0; x<10000000;x++);
        }
    }
}