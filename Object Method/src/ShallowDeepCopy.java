class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy(){ //얕은복사
        Object obj = null;

        try{
            obj = super.clone(); // 갑복제
        }catch (CloneNotSupportedException e) {

        }
        return (Circle)obj;
    }

    public Circle deepCopy() {//깊은 복사사
       Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y); //주소가아닌 객체의 값 복제
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}

class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+", "+y+")";
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경후 = ");
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c3="+c3);

    }
}
