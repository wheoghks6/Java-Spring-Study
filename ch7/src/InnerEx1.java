public class InnerEx1 {
    class InstanceInner{
        int iv = 100;
        //static int cv = 100;
        final static int CONST = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }
    void myMehtod(){
        class LocalInner{
            int iv = 300;
            //static int cv = 300;
            final static int CONST = 300;
        }
        int i = LocalInner.CONST; // 외부클래스에서 내부클래스 상수사용가능
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        //System.out.println(LocalInner.CONST);
        //다른 클래스에서 내부클래스 접근 불가
    }
}
