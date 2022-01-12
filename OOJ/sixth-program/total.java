import CIE.*;
import SEE.*;
import java.util.Scanner;

class total
{
    public static void main (String arg[])
    {
        int i, j, n;
        Scanner sc = new Scanner (System.in);
        int totalm[] = new int [5];
        System.out.println("Enter number of students: ");
        n = sc.nextInt();
        CIE.student s[] = new CIE.student[n];
        CIE.internals ci[] = new CIE.internals[n];
        SEE.externals si[] = new SEE.externals[n];
        for (i = 0; i<n; i++)
        {
            System.out.println("Details of student "+(i+1));
            s[i].display();
            for (j=0; j<5; j++)
            {
                totalm[j] = ci[i].ciem[j] + si[i].seem[j];
                System.out.println("Total marks in subject "+(j+1)+": "+totalm[j]);
            }
            System.out.println();
        }

    }
}