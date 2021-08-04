package HashSet_EX;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4",};
        Set set = new HashSet();

        for(int i=0; i<objArr.length;i++){
            System.out.println(objArr[i]+""+set.add(objArr[i])); //"2"나 "3", "4"가 이미 존재하기때문에 false 반환
            //set은 중복안됨
        }

        System.out.println(set);
        Iterator it = set.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
