import java.util.Optional;

public class Optional_Ex1 {
    public static void main(String[] args) {
        //Optional<String> opt = null;
        Optional<String> opt = Optional.empty();
        System.out.println("opt="+opt);
       /* System.out.println("opt="+opt.get());*/

        String str = "";/*
        try {
            str = opt.get();
        }catch (Exception e){
            str ="";
        }
*/
        str = opt.orElse("EMPTY");
        str = opt.orElseGet(()->new String());
        str = opt.orElseGet(String::new);
        System.out.println("str="+str);
    }
}
