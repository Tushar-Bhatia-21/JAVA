import java.util.Scanner;
public class Daily_max {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the Temperature: ");
                arr[i][j]=sc.nextInt();
            }
        }

        int max=arr[0][0];
        int min=arr[0][0];
        int a=0,b=0,c=0,d=0;

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                    a=i;
                    b=j;
                }
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    c=i;
                    d=j;
                }
            }
        }
        System.out.println("Day and City for Max Temperature is: "+"Date: "+a+" "+b);
        System.out.println("Date and City for Min Temperature is: "+c+" "+d);
    }
}
