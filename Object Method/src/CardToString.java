class Card{
    String kind;
    int number;
    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}

public class CardToString {
    public static void main(String[] args) {
    Card c1 = new Card();
    Card c2 = new Card("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
