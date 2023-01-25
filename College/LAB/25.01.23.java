//Program 1 - Print largest of two

import java.util.Scanner;

    
    public class Largest
    {
        int x, y;
        Largest(int a,int b)
        {
            x=a;
            y=b;
        }

        void largest()
        {
            if(x>y)
            {
                System.out.println("The "+x+" is the largest");
            }
            else
            {
                System.out.println("The "+y+" is the largest");
            }
        }
        
        



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int number1=sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int number2=sc.nextInt();

        Largest a=new Largest(number1,number2);
        a.largest();
        
    }
    

}


//Program 2 - Matrix Multiplication

import java.util.Scanner;
public class mult_array {

public static void main(String args[])
{   
     int row1,col1,row2,col2;
    Scanner s=new Scanner(System.in);

    System.out.println("Enter the number of rows in the fist matrix: ");
    row1=s.nextInt();

    System.out.println("Enter the number of columns in the first matrix: ");
    col1=s.nextInt();

    System.out.println("Enter the number of rows in the second matrix: ");
    row2=s.nextInt();

    System.out.println("Enter the number of columns in the second matrix: ");
    col2=s.nextInt();
    
    if(col1!=row2)
    {
        System.out.println("Matrix multiplication is not possible");
        return;
    }

    int a[][] = new int[row1][col1];
    int b[][] = new int[row2][col2];
    int c[][] = new int[row1][col2];

    System.out.println("\nEnter the values for matrix A: ");
    for(int i=0;i<row1;i++)
    {
        for(int j=0;j<col1;j++)
        {
            a[i][j]=s.nextInt();

        }
    }

    System.out.println("\nEnter the values for matrix B: ");
    for(int i=0;i<row2;i++)
    {
        for(int j=0;j<col2;j++)
        {
            b[i][j]=s.nextInt();

        }
    }
    System.out.println("\nMatrix multiplication is : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col2; j++) {
        // Initialize the element C(i,j) with zero
        c[i][j] = 0;

        // Dot product calculation
        for (int k = 0; k < col1; k++) {
          c[i][j] += a[i][k] * b[k][j];
        }
        
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }

}
}
