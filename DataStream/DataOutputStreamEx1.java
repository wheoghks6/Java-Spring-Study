package DataStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try{
            fos = new FileOutputStream("sample.dat");
            dos = new DataOutputStream(fos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
