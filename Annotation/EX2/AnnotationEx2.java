package EX2;

class NewClass{
    int newField;

    int getNewField(){return newField;}

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){return oldField;}

}

public class AnnotationEx2 {

    public static void main(String[] args) {
        EX2.NewClass nc = new EX2.NewClass();

        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}
