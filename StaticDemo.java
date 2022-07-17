//static Inner Class
class MyCollege
{
    private static final String name="Best Engineering College";
      static class MyDept
    {
        void show()
                {
            System.out.println("college name is"+name);
        }
    }
}
public class StaticDemo {
    public static void main(String[] args) {
         MyCollege mycol=new MyCollege();
         MyCollege.MyDept obj=new MyCollege.MyDept();
         obj.show();
         
    }
}
