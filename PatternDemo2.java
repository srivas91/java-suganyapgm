import java.util.regex.*;
public class PatternDemo2 {
    public static void main(String[] args) {
       Pattern pat=Pattern.compile("[a-z]+");
       String s="101,karthik,7837474847";
       String r[]=s.split(",");
//        System.out.println(r[0]);
        Matcher mat=pat.matcher(r[1]);
        if(mat.matches())
        {
            System.out.println("pattern matched");
        }
        else
        {
            System.out.println("pattern does not match");
        }
       
    }
    
}
