import java.util.Scanner;
import java.lang.String;
class book 
{
    String name, author;
    int price, pages;
    book(){};
    book (String name, String author, int price , int pages)
    {
        this.name= name;
        this.author= author;
        this.price= price;
        this.pages= pages;
    }
    Scanner sc = new Scanner(System.in);
    void set()
    {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter author: ");
        author = sc.nextLine();
        System.out.println("Enter number of pages: ");
        pages = sc.nextInt();
        System.out.println("Enter the price: ");
        price = sc.nextInt();
    }
    public String toString() {
        return(" Name: "+name+"\n Author: "+author+"\n Pages: "+pages+"\n Price: $"+price);
    }
}
    class track 
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of books: ");
            int n = in.nextInt();
            book b[] = new book[n];
            System.out.println("Enter details: ");
            for (int i = 0; i<n; i++)
            {
                b[i]= new book();
                b[i].set();
            }
            for (int j = 0; j<n; j++)
            {
                System.out.println("\n Book "+(j+1)+":");
                System.out.println(b[j]);
            }
        }
    }

