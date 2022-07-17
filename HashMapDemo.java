
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
       HashMap hm=new HashMap();
       hm.put("stuid",101);
       hm.put("stuname","abinaya");
       hm.putIfAbsent("course","java");
       
        System.out.println("hashmap elements are:"+hm);
        System.out.println("student name is"+hm.get("stuname"));
    }
    
}
