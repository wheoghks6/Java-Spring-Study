package Ex1;

@FunctionalInterface
interface MyFunction{
    void run();
}

public class LambdaEx1 {
    static void execute(Ex1.MyFunction f){
        //함수형 인터페이스를 매개변수로 받은 경우
        f.run();
    }

    static Ex1.MyFunction getMyFunction(){
        Ex1.MyFunction f = ()-> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        Ex1.MyFunction f1 = ()-> System.out.println("f1.run()");

        Ex1.MyFunction f2 = new Ex1.MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        //getMyFunction()의 반환형이 MyInterface
        Ex1.MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();
        execute(f1);
        execute( ()-> System.out.println("run()"));
    }
}
