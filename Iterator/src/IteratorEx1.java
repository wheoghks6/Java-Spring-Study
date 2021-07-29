import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);
        }

      /*  it = list.iterator(); //새로운 iterator 객체
        //iterator는 1회용이다. 다사용하면 새로 얻어와야한다.
        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj);
        }*/

        for(int i=0; i<list.size(); i++)
        {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
