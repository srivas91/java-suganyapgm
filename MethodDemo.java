// method local inner class
class Outer
{
    void meth1()
    {
        
        class Inner
        {
            void show()
            {
                System.out.println("inner class method");
            }
        }
        Inner in=new Inner();
        in.show();
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.meth1();
    }
}
