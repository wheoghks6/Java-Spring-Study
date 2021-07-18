public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (Exception e) //Exception은 모든 예외의 최고조상으로서 모든 예외를 처리한다.
        {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
