import java.util.Scanner;
public class array_number {
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int a,b,c;
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Enter the third number: ");
        c=sc.nextInt();

try{
        // Comparision
        
        
            if(a<b&&b<c)
            {
                System.out.println("Increasing");
            }
            else if(a>b&&b>c)
            {
                System.out.println("Decreasing");
            }
            else
            {
                System.out.println("Neither increasing nor decreasing");
            }
        
    }
    catch(Exception e)
    {

    }
}
}
