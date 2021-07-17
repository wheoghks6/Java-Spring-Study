public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1(); // interface 메소드의 오버라이드된 자식 메서드 호출
        c.method2(); // interface 메소드의 오버라이드된 부모메서드 호출
        MyInterface.staticMethod(); //default 메서드는 static메서드처럼 interface라도 인스턴스 생성없이 바로 호출가능
        MyInterface2.staticMethod();
    }
}

class Child extends Parent implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}

class Parent{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}