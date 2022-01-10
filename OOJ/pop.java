import java.util.Scanner;
import java.lang.String;
class Student 
{
    private String name, usn;
    private double marks[];
    private int credit[];
    private double scgpa = 0;
    private int totalcredits = 0;
    Scanner sc = new Scanner(System.in);


    void accept()
    {
        System.out.println("enter name of student: ");
        name = sc.nextLine();
        System.out.println("enter usn of student: ");
        usn = sc.nextLine();
        System.out.println("enter number of subjects");
        int n = sc.nextInt();
        credit = new int[n];
        marks = new double[n];
        System.out.println("ENTER MARKS & CREDITS: ");
        for(int i = 0; i<n ; i++)
        {
            System.out.println("SUBJECT "+(i+1)+":");
            marks[i] = sc.nextDouble();
            System.out.println("CREDIT  "+(i+1)+":");
            credit[i] = sc.nextInt();
            calculate(credit[i],marks[i],i);
        }
    }
    void calculate(int credit, double marks, int j)
    {
        totalcredits = totalcredits + credit;
        if(marks>= 90 && marks <= 100) scgpa = scgpa + (10 * credit);
        else if(marks>= 80 && marks <= 89) scgpa = scgpa + (9 * credit);
        else if(marks>= 70 && marks <= 79) scgpa = scgpa + (8 * credit);
        else if(marks>= 60 && marks <= 69) scgpa = scgpa + (7 * credit);
        else if(marks>= 50 && marks <= 59) scgpa = scgpa + (6 * credit);
        else if(marks>= 40 && marks <= 49) scgpa = scgpa + (5 * credit);
        else System.out.println("FAILED");
    }
    void display()
    {
        System.out.println("\nStudent Details:");
        System.out.println("name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("SCGPA: "+(scgpa/totalcredits));

    }
}
class pop
{
        public static void main(String args [])
        {
        Student s1 = new Student();
        s1.accept();
        s1.display();
    }
}

    


