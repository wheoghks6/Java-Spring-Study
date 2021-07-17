import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() { //익명클래스 부모클래스 타입으로 할당한다. 클래스 정의와 객체생성 한번에
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}

/*
class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("ActionEvent occurred!!!");
    }
}*/
