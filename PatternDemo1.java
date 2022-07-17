
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {
    public static void main(String[] args) {
        Pattern pat=Pattern.compile("^r...a$");
        Matcher mat=pat.matcher("ramya");
        if(mat.matches())
        {
            System.out.println("pattern matched");
            System.out.println("start position:"+mat.start());
            System.out.println("end position:"+mat.end());
            System.out.println("grouped character:"+mat.group());
        }
        else
        {
            System.out.println("pattern does not match");
        }
        
        
    }
    
}
