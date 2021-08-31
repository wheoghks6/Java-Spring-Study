package Stream7;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

class Student{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {return name;}
    boolean isMale() {return isMale;}
    int getHak() {return hak;}
    int getBan() {return ban;}
    int getScore() { return score;}

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년, %d반, %3d점]",name,isMale ? "남":"여", hak, ban, score);
    }

    enum Level {HIGH, MID, LOW}
}


public class Stream7 {
    public static void main(String[] args) {
        Student[] stuArr = {
                    new Student("나자바",true, 1,1,300),
                    new Student("김지미",false, 1,1,250),
                    new Student("김자바",true, 1,1,200),
                    new Student("이지미",false, 1,2,150),
                    new Student("남자바",true, 1,2,100),
                    new Student("안지미",false, 1,2,50),
                    new Student("황지미",false, 1,3,100),
                    new Student("강지미",false, 1,3,150),
                    new Student("이자바",true, 1,3,200),

                    new Student("나자바",true, 2,1,300),
                    new Student("김지미",false, 2,1,250),
                    new Student("김자바",true, 2,1,200),
                    new Student("이지미",false, 2,2,150),
                    new Student("남자바",true, 2,2,100),
                    new Student("안지미",false, 2,2,50),
                    new Student("황지미",false, 2,3,100),
                    new Student("강지미",false, 2,3,150),
                    new Student("이자바",true, 2,3,200),
        };

        System.out.printf("1.단순분할(성별로 분할)%n");
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student::isMale));

        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);

        for(Student s : maleStudent) System.out.println(s);
        for(Student s : femaleStudent) System.out.println(s);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수) %n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale , counting()));

        System.out.println("남학생 수 : "+stuNumBySex.get(true));
        System.out.println("여학생 수 : "+stuNumBySex.get(false));

        System.out.println();
        System.out.println("%n3.단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, maxBy(Comparator.comparingInt(Student::getScore))));

        System.out.println("남학생 1등 : "+topScoreBySex.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex.get(false));

        Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, collectingAndThen(maxBy(Comparator.comparingInt(Student::getScore)), Optional::get)));

        System.out.println("남학생 1등 : "+topScoreBySex2.get(true));
        System.out.println("여학생 1등 : "+topScoreBySex2.get(false));

        System.out.println();
        System.out.printf("%n4. 다중분할(성별 불합격자, 100점이하) %n");

        Map<Boolean, Map<Boolean, List<Student>>> failStuBySex =
                Stream.of(stuArr).collect(partitioningBy(Student::isMale, partitioningBy(s->s.getScore() <= 100)));

        List<Student> failedMaleStu = failStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failStuBySex.get(false).get(true);

        for(Student s : failedMaleStu) System.out.println(s);
        for(Student s : failedFemaleStu) System.out.println(s);



    }
}
