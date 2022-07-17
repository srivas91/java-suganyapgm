final class Parent
{
    void display()
    {
        System.out.println("parent class");
    }
}
class Child extends Parent
{  
}
public class InheritDemo {
    public static void main(String[] args) {
      Child obj=new Child();
      obj.display();
    }
}
