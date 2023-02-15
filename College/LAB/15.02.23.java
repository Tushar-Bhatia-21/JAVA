//EXAMINATION QUES 1
import java.util.Scanner;
public class EXAMINATION {
 public static void main(String[] args)
{
    int[] Roll_no;
    
    Roll_no=new int[10];
    
    int[] total;
    total=new int[10];

    int[] M1;
    M1=new int[10];
    int[] M2;
    M2=new int[10];
    int[] M3;
    M3=new int[10];

    Scanner sc=new Scanner(System.in);

    //USER INPUT
            for(int i=0;i<3;++i)
        {
            System.out.println("Enter the Roll number of Student: ");
            Roll_no[i]=sc.nextInt();
            
            System.out.println("Enter the Marks of Subject 1: ");
            M1[i]=sc.nextInt();
            
            System.out.println("Enter the Marks of Subject 2: ");
            M2[i]=sc.nextInt();
            
            System.out.println("Enter the Marks of Subject 3: ");
            M3[i]=sc.nextInt();
            
            total[i]=M1[i]+M2[i]+M3[i];
            System.out.println("Total is: "+total[i]);
        }


int max_1=M1[0];
int max_2=M2[0];
int max_3=M3[0];
int max_4=total[0];
int index_1=0,index_2=0,index_3=0,index_4=0;

//INDEX VALUES
        for(int i=0;i<3;i++)
        {
            if(max_1<M1[i])
            {
                max_1=M1[i];
                index_1=i;
            }

            if(max_2<M2[i])
            {
                max_2=M2[i];
                index_2=i;
            }

            if(max_3<M3[i])
            {
                max_3=M3[i];
                index_3=i;
            }

            if(max_4<total[i])
            {
                max_4=total[i];
                index_4=i;
            }


        }
        
//SUB 1
System.out.println("The Roll number of the student scoring the highest marks in subject 1 is: "+Roll_no[index_1]);

//SUB 2
System.out.println("The Roll number of the student scoring the highest marks in subject 2 is: "+Roll_no[index_2]);


//SUB 3
System.out.println("The Roll number of the student scoring the highest marks in subject 3 is: "+Roll_no[index_3]);


//Total
System.out.println("The Roll number of the student scoring the highest marks is: "+Roll_no[index_4]);


        }
    }

// Arithemetic Excpetion
public class Arithemetic_error {
    public static void main(String[] args)
    {   
    int d;
    int a;
    {
    try {
        {
            d=0;
            a=42/d;
            System.out.println(".");
        }
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Divisor by 0");
    }
    System.out.println("After the catch statement");
    
}
}
}

//Array Index out of bounds
public class Array_index_OB {
    public static void main(String[] args)
    {
        int arr[]={0,1,2,3};
        try
        {
            System.out.println("Array element is"+arr[4]);
        }
        catch(Exception e)
        {
            System.out.println("Array index out of bounds "+e);
        }
    }
    
}

