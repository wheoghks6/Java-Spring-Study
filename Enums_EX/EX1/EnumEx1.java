package EX1;

enum Direction{EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {
    public static void main(String[] args) {
        EX1.Direction d1 = EX1.Direction.EAST;
        EX1.Direction d2 = EX1.Direction.valueOf("WEST");
        EX1.Direction d3 = Enum.valueOf(EX1.Direction.class, "EAST");

        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);

        System.out.println("d1 == d2 ? "+ (d1==d2));
        System.out.println("d1 == d3 ? "+ (d1 == d3));
        System.out.println("d1.equals(d3) ? "+d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));

        switch (d1){
            case EAST:
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            default:
                System.out.println("Invalid direction"); break;
        }

        EX1.Direction[] dArr = EX1.Direction.values();

        for(EX1.Direction d : dArr)
            System.out.printf("%s = %d%n", d.name(), d.ordinal());

    }
}
