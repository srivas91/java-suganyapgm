class Bank
{
    int amount=1000;
    void deposit(int d)
    {
        amount=amount+d;
        System.out.println("deposited amount:"+d);
    }
    void withdraw(int a)
    {
        amount=amount-a;
        System.out.println("cash withdrawn:"+a);
    }
    void balance()
    {
        System.out.println("balance amount is"+amount);
    }
}

class StateBank extends Bank 
{
    
}

class IndianBank extends Bank
{
    
}

public class BankingApp {
   public static void main(String[] args) {
        StateBank obj1=new StateBank();
         obj1.deposit(2000);
         obj1.balance();
         obj1.withdraw(500);
         obj1.balance();
         IndianBank obj2=new IndianBank();
//         obj2.deposit(1500);
//         obj2.withdraw(1000);
    }
    
}
