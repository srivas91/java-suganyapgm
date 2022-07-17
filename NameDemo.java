public class NameDemo {
    public static void main(String[] args) {
        String name="a1#$B23u";
        int upcount=0,lowcount=0;
        System.out.println(name.length());
        char c[]=name.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        for(char d:c)  // for each loop
        {
            if(Character.isLowerCase(d))
            {
                lowcount=lowcount+1;
            }
            else if(Character.isUpperCase(d))
            {
                upcount=upcount+1;
            }
//            System.out.println(d);
        }
        System.out.println("lowercase count is"+lowcount);
        System.out.println("uppercase count is"+upcount);
    }  
}
