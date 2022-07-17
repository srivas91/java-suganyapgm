
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
         File file=new File("E:\\Suganya\\tech.txt");
         FileWriter fw=new FileWriter(file);
         BufferedWriter bw=new BufferedWriter(fw);
         String wishes[]={"happy saturday","good bye"};
         for(String b:wishes)
         {
         bw.write(b);
         bw.newLine();
         }
         bw.close();
         fw.close();
         
    }
    
}
