import java.util.Scanner;

abstract class shape {
    double a,b;
}

class rectrangle extends shape 
{
    void data(double x, double y)
    {
    a = x;
    b = y;
    }
    void printarea()
    {
        double area = a * b;
        System.out.println("area: "+area);
    }

}

class triangle extends shape 
{
    void data(double x, double y)
    {
        a = x;
        b = y;
    }
    void printarea()
    {
        double area = 0.5 * a * b;
        System.out.println("area: "+area);
    }
}

class circle extends shape 
{
    void data(double r)
    {
        a = r;
    }
    void printarea()
    {
        System.out.println("area: "+(3.14 * a * a));
    }
}

class area
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        triangle tr = new triangle();
        circle c = new circle();
        rectrangle rt = new rectrangle();
        System.out.println("Choose the shape you want to find the area of: ");
        System.out.println(" 1. TRIANGLE \n 2. CIRCLE \n 3. RECTRANGLE\n");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter HEIGHT: ");
            double h = sc.nextDouble();
            System.out.println("ENTER BASE:");
            double b = sc.nextDouble();
            tr.data(h,b);
            tr.printarea();
            break;
            case 2:
            System.out.println("Enter RADIUS: ");
            double r = sc.nextDouble();
            c.data(r);
            c.printarea();
            break;
            case 3:
            System.out.println("Enter LENGTH: ");
            double l = sc.nextDouble();
            System.out.println("ENTER BREADTH:");
            double bd = sc.nextDouble();
            rt.data(l,bd);
            rt.printarea();
            break;
            default: System.out.println("WRONG CHOICE:");
        }

    }
}
