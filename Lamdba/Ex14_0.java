public class Ex14_0 {
    public static void main(String[] args) {
        MyFunction2 f = (a,b)-> a>b?a:b;

        int value = f.max(3, 5); //함수형 인터페이스스
        System.out.println("value = "+value);
    }
}

@FunctionalInterface //함수형 인터페이스는 추상 메서드 하나만 가질 수 있다.
interface MyFunction2{
    int max(int a, int b);
}
