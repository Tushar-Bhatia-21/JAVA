import java.util.Scanner;
class pattern_11
{
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i, j, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j< i + 1; j++) {
                System.out.print(k++ + " ");
            }
   
            System.out.println();
            
        }
    }
   
}

