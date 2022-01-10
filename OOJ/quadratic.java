import java.lang.Math;
import java.util.Scanner;

public class quadratic {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    Double a,b,c,r1,r2,dis;
    System.out.println("Enter the values for a b c ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    dis = Math.pow(b,2) - (4*a*c);
    if (dis > 0.0)
    {
        r1 = -b + (Math.pow(dis, 0.5)/ 2 * a);
        r2 = -b - (Math.pow(dis, 0.5)/ 2 * a);
        System.out.println("Roots are: "+r1 +" and"+r2 );
    }
    else if (dis == 0.0)
    {
        r1 = -b / 2 * a;
        System.out.println("Roots are: "+r1+" and"+r1);
    } 
    else System.out.println("NO REAL ROOTS");
}
}
