enum dept{HR,SALES,MARKETING};
class Employee 
{
    int id;
    String name;
    dept d;
    String location;

    public Employee(int id, String name, dept d, String location) {
        this.id = id;
        this.name = name;
        this.d = d;
        this.location = location;
    }
    

    @Override
    public String toString() {
        return String.format("%d %s %s",id,name,d);
    }
    
    
    
    
    
    
}
public class CompanyInfo {
    public static void main(String[] args) {
       Employee emp1=new Employee(1001,"suganya",dept.HR,"tiruvallur");
       Employee emp2=new Employee(1002,"ramya",dept.SALES,"tiruvallur");
      
        System.out.println("emp1 detail is"+emp1);
    }
}
