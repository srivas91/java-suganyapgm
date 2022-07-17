
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet fruits=new HashSet();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        System.out.println("set of fruits are:"+fruits);
        System.out.println("size is"+fruits.size());
        
    }
    
}
