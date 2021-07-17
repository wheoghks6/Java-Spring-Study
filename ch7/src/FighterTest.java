abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable{
    void move(int x, int y); //public abstract 생략됨
    void attack(Fightable f); //public abstract 생략됨
}

class Fighter extends Unit implements Fightable{
    //오버라이딩 규칙 : 조상(public) 보다 접근제어자가 좁으면 안된다. 꼭 public을 붙여준다.
    public void move(int x, int y){
        System.out.println("[" + x + ","+y+"]로 이동");
    }

    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }

    //싸울 수 있는 상대를 불러온다.
    Fightable getFightable(){
        Fighter f = new Fighter();
        return f;
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();

    }
}
