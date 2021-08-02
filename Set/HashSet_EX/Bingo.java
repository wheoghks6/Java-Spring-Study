package HashSet_EX;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();
        //Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for(int i=0; set.size() < 25;i++){
            set.add((int)(Math.random()*50)+1+""); //false인 경우 add 되지 않기 때문에  for문 제어를 size로했다.
        }

        Iterator it = set.iterator();

        for(int i=0;i < board.length;i++){
            for(int j=0; j<board[i].length;j++){
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ")+board[i][j]); //한자리 수의 경우 공백 2칸 나머지 공백 1칸
            }
            System.out.println();
        }
    }
}
