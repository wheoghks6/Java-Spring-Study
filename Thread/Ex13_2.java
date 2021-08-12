public class Ex13_2 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        ThreadEx13_2 th2 = new ThreadEx13_2();
        th1.start();
        th2.start();

        startTime = System.currentTimeMillis();

        try{
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
        }

        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx13_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx13_2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<300;i++){
            System.out.print(new String("l"));
        }
    }
}
