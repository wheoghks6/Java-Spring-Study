import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity)
    {
        super(capacity);
    }

    public MyVector2(){
        this(10);
    }

    public String toString(){
        String tmp = "";
        Iterator it = iterator();

        for(int i=0; it.hasNext();i++){
            if(i!=0)
                tmp+=", ";
            tmp+=it.next();

        }
        return "["+tmp+"]";
    }

    public Iterator iterator(){
        cursor = 0;
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    public void remove(){
        if(lastRet == -1){
            throw new IllegalStateException();
        }
        else{
            remove(lastRet);
            cursor--;
            lastRet =-1; //삭제이후 lastRet = -1
        }
    }
}
