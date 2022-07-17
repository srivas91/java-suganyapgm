//Local Inner Class
class College
{
    private String name="Vishwaksena Arts & Science College";
    class Dept
    {
        private String dept="CSE";
        void display()
        {
            System.out.println("college name is"+name);
            System.out.println("dept name is"+dept);
        }
    }
}
public class InnerDemo1 {
    public static void main(String[] args) {
         College outer=new College();
         College.Dept inner=outer.new Dept();
         inner.display();
    }
}

