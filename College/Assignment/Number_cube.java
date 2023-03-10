import java.util.Scanner;
public class Main
{ 
    
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    System.out.println("Number is: "+i+" The cube of number is: "+i*i*i);
		}
	}
}
