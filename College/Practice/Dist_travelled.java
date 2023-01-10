import java.util.*;
public class Dist_travelled
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        int t=1;
        float a;
        float u;
        System.out.println("Enter the interval: ");
        n= sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println("Enter the speed: ");
            u=sc.nextFloat();
            System.out.println("Enter the acceleration: ");
            a=sc.nextFloat();
            double d=u*t+0.5*a*t*t;
            System.out.println("The distance travelled for the interval is: "+d);
            t=t+n;
            i++;
        }
    }
}
