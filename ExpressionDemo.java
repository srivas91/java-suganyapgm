import java.util.regex.*;
public class ExpressionDemo {
    public static void main(String[] args) {
       Pattern pat=Pattern.compile("b.....i$");
       Matcher mat=pat.matcher("bhavany");
       if(mat.matches())
       {
            System.out.println("pattern matched");
           System.out.println("start position:"+mat.start());
           System.out.println("end position:"+mat.end());
           System.out.println("grouped characters:"+mat.group()); 
       }
       else
       {
           System.out.println("pattern does not match");
       }
    }
    
}
