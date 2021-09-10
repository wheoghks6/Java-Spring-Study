package File_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\wheog\\IdeaProjects\\IO_Stream\\src\\File_IO\\FileCopy.java");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\wheog\\abcdef.txt");

            int data = 0;
            while((data = fis.read())!= -1)
            {
                fos.write(data);
            }
            fis.close();
            fos.close();
        }catch (Exception e){}


    }
}
