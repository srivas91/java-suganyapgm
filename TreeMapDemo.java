
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
       TreeMap hm=new TreeMap();
       hm.put("stuid",101);
       hm.put("stuname","abinaya");
       hm.putIfAbsent("course","java");
       
        System.out.println("treemap elements are:"+hm);
        System.out.println("student name is"+hm.get("stuname"));
    }
    
}
