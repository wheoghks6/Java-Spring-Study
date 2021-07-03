package Cafe;

import java.util.Scanner;

public class cafe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CafeProcess cafeprocess = new CafeProcess();
        
       while(true)
       {
           System.out.print("주문을 입력하세요 : ");
           String order = scanner.nextLine();

           cafeprocess.processing(order);
           System.out.println("");
       }
    }
}
