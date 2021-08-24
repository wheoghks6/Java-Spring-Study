import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex_random {
    public static void main(String[] args) {
        //5부터 10까지의 난수
        IntStream intStream = new Random().ints(5, 10);
        intStream.limit(5).forEach(System.out::println);

        //iterate(T seed, UnaryOperator f) : 단항연산자
        // -> 1부터 홀수 10개 출력
        Stream<Integer> int2Stream = Stream.iterate(1,n->n+2);
        int2Stream.limit(10).forEach(System.out::println);

        //generate(Supplier<T> s) : 매개변수없이 공급만. 입력X 출력O
        //람다식의 결과인 1만 10개 출력
        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
