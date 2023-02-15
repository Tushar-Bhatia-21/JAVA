import java.util.Scanner;
public class Mycalc {
    interface Advanced_Arithemetic
    {
        int divisor_sum(int n);
    }

    class mycalculator implements Advanced_Arithemetic
    {
        int result=0;
        public int divisor_sum(int n)
        {
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(i==n)
            {
                result+=i;
            }
            else
            {
                result+=(i+n/i);
            }
        }
        
        return (result+1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value: ");
        n=sc.nextInt();
        Mycalc a=new Mycalc();
        mycalculator b=a.new mycalculator();
        System.out.println("Total is: "+b.divisor_sum(n));
    }
}
