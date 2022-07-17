

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
         File file=new File("E:\\Suganya\\tech.txt");
         FileReader fr=new FileReader(file);
         int a=fr.read();
         while(a!=-1)
         {
         System.out.println("a value is"+(char)a);
         a=fr.read();
         }       
        
    }
    
}
