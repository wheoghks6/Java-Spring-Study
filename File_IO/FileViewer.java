package File_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\wheog\\IdeaProjects\\IO_Stream\\src\\File_IO\\FileViewer.java");
        int data = 0;

        while((data = fis.read()) != -1){
            char c = (char) data;
            System.out.print(c);
        }

    }
}
