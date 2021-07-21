package Math;

public class RountTest {
    public static void main(String[] args) {
        for(double d=0.0; d<=2.0; d+=0.1)
        {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f%n",d,d1,d2);
            //rint는 1.5와 2.5모두 2.0이된다. 가능한 짝수가 되려하는것 같다.
        }
    }
}
