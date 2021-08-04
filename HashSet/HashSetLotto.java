package HashSet_EX;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i=0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45)+1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set); //set을 list에저장
        Collections.sort(list); //list정렬
        System.out.println(list); //리스트 출력
    }
}
