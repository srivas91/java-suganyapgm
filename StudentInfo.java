class Student1
{
    void display()
    {
        class Subject
        {
            void show()
            {
                System.out.println("student subject");
            }
        }
        Subject obj1=new Subject();
        obj1.show();
    }
}
public class StudentInfo {

    public static void main(String[] args) {
        Student1 obj=new Student1();
        obj.display();
    }
    
}
