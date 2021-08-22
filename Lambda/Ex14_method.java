import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_method {
    public static void main(String[] args) {
       /* //Supplier<MyClass> s = () -> new MyClass();*/
        Supplier<MyClass> s = MyClass::new;

        System.out.println(s.get());

        //Function<Integer,MyClass> f = (i) -> new MyClass(i);
        Function<Integer, MyClass> f = MyClass::new;

        System.out.println(f.apply(200).iv);


        Function<Integer, int[]> f2 = int[]::new;
        System.out.println("arr.length = "+f2.apply(100).length);
    }
}

class MyClass{
    int iv;

    MyClass(int iv){
        this.iv = iv;
    }
    MyClass(){
    }
}