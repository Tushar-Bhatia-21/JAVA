import java.util.Random;
public class random_gen {
    public static void main(String [] args)
    {
        Random random =new Random();
        int arr[]=new int[100];

        int negative_count=0;
        int positive_count=0;
        int odd_positive_count=0;
        
        for(int i=0;i<100;i++)
        {
            arr[i]=random.nextInt(201)-100;
            System.out.println(arr[i]);
        }
        
        for(int n:arr)
        {
            if(n<0)
            {
                negative_count++;
            }
            else
            {
                if(n%2==0)
                {
                    positive_count++;
                }
                else
                {
                    odd_positive_count++;
                }
            }
        }

        System.out.println("Negative numbers are: "+negative_count);
        System.out.println("Even positive numbers are: "+positive_count);
        System.out.println("Odd positive numbers are: "+odd_positive_count);



    }
}
