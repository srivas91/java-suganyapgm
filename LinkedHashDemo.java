
import java.util.LinkedHashSet;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashSet fruits=new LinkedHashSet();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add(20);
        fruits.add("orange");
        fruits.add("apple");
        System.out.println("set of fruits are:"+fruits);
        System.out.println("size is"+fruits.size());
        
    }
    
}
