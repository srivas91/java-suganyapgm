
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList courses=new LinkedList();
         courses.add("java");
         courses.add("python");
         courses.addFirst("php");
         courses.addLast("fortran");
         courses.add("go");
         courses.add("java");
         System.out.println("list of courses are:"+courses);
        
    }
    
}
