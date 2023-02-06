Voting_sys and Eductaion inheritance
import java.util.Scanner;
import java.util.Arrays;
public class String_rev {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        char arr[] = str.toCharArray();
/* 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
 
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
*/    
        //By using sort string function in java
        Arrays.sort(arr);
        System.out.println(arr);
        



    }
}
