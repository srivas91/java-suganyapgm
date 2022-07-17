

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
         File file=new File("E:\\Suganya\\tech.txt");
         FileReader fr=new FileReader(file);
         BufferedReader br=new BufferedReader(fr);
         String line=br.readLine();
         
         while(line!=null)
         {
             System.out.println("file content is"+line);
             
             line=br.readLine(); 
         }
         
             
        
    }
    
}
