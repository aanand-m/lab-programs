import java.util.Scanner;
import java.lang.Math;

class bank
{
    String name;
    int accno;
    double bal, sim;

    Scanner sc = new Scanner(System.in);

    void accept ()
    {
        System.out.println();
        System.out.println("Enter name of the account holder: ");
        name = sc.nextLine();
        System.out.println("Enter account number: ");
        accno = sc.nextInt();
        System.out.println("Enter account balance: ");
        bal = sc.nextDouble();
    }

    void display () 
    {
        System.out.println();
        System.out.println("Details: ");
        System.out.println("Name: "+name+"\nAccount Number: "+accno+"\nBalance: "+bal);

    }

    void deposit()
    {
        System.out.println();
        System.out.println("\nDo you want to deposit ? (Type 1 for yes and 2 for no): ");
        int d = sc.nextInt();
        if (d == 1)
        {
            System.out.println("Enter the amount to be deposited: ");
            int amt = sc.nextInt();
            bal = bal + amt;
            System.out.println("avaliable balance: "+bal);
        }
    }
}


class savings extends bank 
{
    void cheque ()
    {
        System.out.println("\nNo cheque service offered.");
    }
    void simpleintersest()
    {
        System.out.println();
        System.out.println("Enter rate of interest: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of times inteserst applied per time period: ");
        int n = sc.nextInt();
        System.out.println("Enter time elapsed: ");
        int t = sc.nextInt();
        sim = bal * (1 + r/n);
        System.out.println("Simple Interest: $ "+(Math.pow(sim, n*t)));
    }

    void withdraw()
    {
        float amount;
        System.out.println("No minimum balance required: ");
        System.out.println("Enter the amount to be withdrawn: ");
        amount = sc.nextFloat();
        if (amount > bal) System.out.println("Insufficient funds!!");
        else 
        {
            bal = bal - amount;
            System.out.println("$"+amount+" withdrawn");
            System.out.println("Avaliable balance: $"+bal);
        }
    }
}

class current extends bank 
{
    double servicecharge = 100;
    void cheque ()
    {
        System.out.println("\nCheque service available!!");
    }
    void withdraw()
    {
        float amount;
        System.out.println("Minimum balance of $1000.00");
        System.out.println("Enter the amount to be withdrawn: ");
        amount = sc.nextFloat();
        if (amount > bal) System.out.println("Insufficient funds!!");
        else 
        {
            bal = bal - amount;
            if (bal < 1000 )
            {
                bal = bal - servicecharge;
                System.out.println("Service charge of $"+servicecharge+"is added.");
                System.out.println("Avaliable balance = $"+bal);
            }
            else
            {
                System.out.println("$"+amount+" withdrawn");
                System.out.println("Avaliable balance: $"+bal);
            }
        }
    }
}

class bankingsystem 
{
    public static void main(String[] args)
    {
        savings ob1 = new savings();
        current ob2 = new current();
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose an account type: ");
        System.out.println("1. Savings.");
        System.out.println("2. Current.");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: 
            ob1 = new savings();
            ob1.accept();
            ob1.display();
            ob1.cheque();
            ob1.deposit();
            ob1.simpleintersest();
            ob1.withdraw();
            break;
            case 2:
            ob2 = new current();
            ob2.accept();
            ob2.display();
            ob2.cheque();
            ob2.deposit();
            ob2.withdraw();
            break;
            default: System.out.println("Invalid input!");
        }
    }    
}
