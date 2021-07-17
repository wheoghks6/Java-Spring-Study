class A{
    public void method(I b){
        b.method();
    }
}
//B클래스의 선언과 구현을 분리
interface I{
    public void method();
}

class B implements I{
    public void method(){
        System.out.println("B클래스의 메서드");
    }
}

class C implements I{
    public void method(){
        System.out.println("C클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());
    }
}
