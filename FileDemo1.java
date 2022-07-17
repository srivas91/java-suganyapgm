
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
         File file=new File("E:\\Suganya\\tech.txt");
         FileWriter fw=new FileWriter(file);
         fw.write("have a great weekend \n");
         fw.write("see you on next week");
         fw.close();
         if(file.exists())
         {
             System.err.println("folder already exists");
          }
         else
         {
             file.createNewFile();
//             file.mkdir();
         }
         
    }
    
}
