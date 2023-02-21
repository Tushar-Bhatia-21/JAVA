import java.math.*;
import java.util.Scanner;
public class Floating_pt {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        float a= sc.nextFloat();

        System.out.println("Enter the second number: ");
        float b= sc.nextFloat();
        
        int x=Math.round(a*1000)/1000;
        int y=Math.round(b*1000)/1000;
        
        if(x==y)
        {
            System.out.println("They are equal");
        }

        else
        {
            System.out.println("They are not equal");
        }
    }

}
