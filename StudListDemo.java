
import java.util.ArrayList;

class Student
{
    int id;
    String name,course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    
    @Override
    public String toString() {
        return String.format("%d %s %s",id,name,course);
    }         
}
public class StudListDemo {

    public static void main(String[] args) {
     ArrayList<Student> list=new ArrayList<>();
     Student s1=new Student(101,"ramya","java");
     Student s2=new Student(102,"abinaya","java");
     Student s3=new Student(103,"suganya","python");
     list.add(s1);
     list.add(s2);
     list.add(s3);
     for(Student m:list)
     {
           if(m.getCourse().equals("java"))
           {
        System.out.println("student detail is"+m);
           }
    }
    }
    
}
