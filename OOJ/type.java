import java.util.Scanner;
class multiple <T, V>
{
    T ob1;
    V ob2;

    multiple(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes()
    {
        System.out.println("Type of first: "+ob1.getClass().getName());
        System.out.println("Type of second: "+ob2.getClass().getName());
    }

    T getob1()
    {
        return ob1;
    }

    V getob2()
    {
        return ob2;
    }
}

class type 
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s = sc.nextLine();
        System.out.println("Enter any integer: ");
        int i = sc.nextInt();

        System.out.println();

        System.out.println("Enter any String: ");
        String st = sc.next();
        System.out.println("Enter any Double: ");
        double d = sc.nextDouble();

        multiple<String, Integer> tgobj = new multiple<String, Integer> (s,i);
        tgobj.showTypes();

        String str = tgobj.getob1();
        System.out.println("value of set1: "+str);
        int v = tgobj.getob2();
        System.out.println("value of set1: "+v);

        System.out.println();

        multiple<String, Double> tobj = new multiple <String, Double> (st, d);
        tobj.showTypes();
        String strn = tobj.getob1();
        System.out.println("Value of set2: "+strn);
        double vd = tobj.getob2();
        System.out.println("Value of set2: "+vd);
    }
}