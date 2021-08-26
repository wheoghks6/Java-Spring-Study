import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_flatMap_Ex {
    public static void main(String[] args) {
        Stream<String[]> strArraStrm = Stream.of(
                new String[] {"abc", "def", "jkl"},
                new String[] {"ABC", "DEF", "JKL"}
        );

        //하나의 스트림으로 합칠때 flatMap
        Stream<String> strStrm = strArraStrm.flatMap(Arrays::stream);
        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
            "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) //하나 이상의 공백 정규식
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm
                .map(s->s.toArray(String[]::new))
                .flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}