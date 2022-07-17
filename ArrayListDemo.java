
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("india");
        countries.add("japan");
        countries.add(30);
        countries.add("france");
        countries.add("india");
        System.out.println("countries are"+countries);
        System.out.println("size is"+countries.size());
        countries.remove("france");
        System.out.println("countries now"+countries);
    }
    
}
