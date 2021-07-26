import java.util.Locale;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true){
            String prompt = ">>";
            System.out.println(prompt);

            String input = s.nextLine();
            argArr = input.split(" +");//공백 + 는 정규표현식에서 여러개의 공백을 의미한다.

            String command = argArr[0].trim();
            if("".equals(command)) continue;

            command = command.toLowerCase();

            if(command.equals("q"))
            {
                System.exit(0);
            }else
            {
                for(int i=0; i<argArr.length;i++)
                    System.out.println(argArr[i]);
            }

        }

    }
}
