import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();//리스트를 스트림으로 변환
        intStream.forEach(System.out::print);
        System.out.println();

        intStream = list.stream();
        intStream.forEach(System.out::print);
        System.out.println();

        String[] strArr = {"a","b","c"};
/*        Stream<String> strStream = Stream.of(strArr);*/
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream int2Stream = Arrays.stream(intArr);
     //   intStream.forEach(System.out::println);
      //  System.out.println("count = "+intStream.count());
        /*  System.out.println("sum = "+intStream.sum());*/
        System.out.println("average = "+int2Stream.average());
    }
}
