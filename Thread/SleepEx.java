public class SleepEx {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();
        th1.start();
        th2.start();

        try{
            th1.sleep(2000); //sleep 메소드는 자기자신 쓰레드에서만 작동된다. 일반적으로 Thread.sleep()을 사용한다.
                                //main쓰레드가 2초간 정지한다. 다른 쓰레드 sleep 불가. 자기쓰레드만 sleep가능
        }catch (InterruptedException e){}

        System.out.print("<<main 종료>>");
    }

    static void delay(long millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){}
    }
}

class ThreadEx12_1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<300; i++)
            System.out.print("-");

        System.out.print("<<th1 종료>>");
    }
}


class ThreadEx12_2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<300; i++)
            System.out.print("|");

        System.out.print("<<th2 종료>>");
    }
}