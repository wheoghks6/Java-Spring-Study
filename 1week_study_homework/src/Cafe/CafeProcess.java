package Cafe;

public class CafeProcess {
    public void processing(String s)
    {

        if(s.equals("메뉴판"))
        {
            menuList();
        }
        else if(s.contains("알려주세요!"))
        {
            question(s);
        }
        else if(s.contains(" 내놔!"))
        {
            recipe(s);
        }
    }

    void menuList()
    {
        System.out.println("");
        System.out.println("아메리카노(ice)");
        System.out.println("아메리카노(hot)");
        System.out.println("카페라떼(ice)");
        System.out.println("카페라떼(hot)");
        System.out.println("바닐라라떼(ice)");
        System.out.println("바닐라라떼(hot)");
        System.out.println("딸기 스무디");
        System.out.println("요거트 스무디");
        System.out.println("아이스티");
    }

    void question(String s)
    {
        if(s.equals("우유가 들어가는 커피를 알려주세요!"))
        {
            System.out.println("1. 카페라떼(ICE/HOT)");
            System.out.println("2. 바닐라라떼(ICE/HOT)");
        }
        else if(s.equals("커피가 들어가지 않는 음료를 알려주세요!"))
        {
            System.out.println("1.딸기 스무디");
            System.out.println("2.요거트 스무디");
            System.out.println("3.아이스티");
        }
        else if(s.equals("초콜릿 음료를 알려주세요!"))
        {
            System.out.println("1.없습니다.");
        }
    }

    void recipe(String s)
    {
        if(s.contains("아메리카노"))
        {
            System.out.println("물을 넣는다.");
            System.out.println("에스프레소를 넣는다.");
        }
        else if(s.contains("카페라떼"))
        {
            System.out.println("우유를 넣는다.");
            System.out.println("에스프레소를 넣는다.");
        }
        else if(s.contains("바닐라라떼"))
        {
            System.out.println("우유를 넣는다.");
            System.out.println("에스프레소를 넣는다.");
            System.out.println("바닐라 시럽을 넣는다.");
        }
        else if(s.contains("딸기 스무디"))
        {
            System.out.println("우유를 넣는다.");
            System.out.println("딸기를 넣는다.");
            System.out.println("믹서기를 이용해 섞는다.");
        }
        else if(s.contains("요거트 스무디"))
        {
            System.out.println("우유를 넣는다.");
            System.out.println("요거트를 넣는다.");
            System.out.println("믹서기를 이용해 섞는다.");
        }
        else if(s.contains("아이스티"))
        {
            System.out.println("물을 넣는다.");
            System.out.println("아이스티 분말을 넣는다.");
            System.out.println("얼음을 넣는다.");
        }

        if(s.contains("(ice)"))
        {
            System.out.println("(ice) 얼음을 넣는다.");
        }
    }
}
