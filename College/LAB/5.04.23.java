import java.util.Scanner;
//Write a method delete that returns an input string with n element removed.
public class String_del {
    
    static Scanner sc=new Scanner(System.in);
    
    public static String[] delete(String inputString, int n) {
        // If n is greater than or equal to the length of the input string, return an empty string
        if (n >= inputString.length()) {
            return new String[] {"", ""};
        }
        
        // Convert the input string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Store the removed characters in a separate string
        String removedString = new String(charArray, 0, n);
        
        // Loop through the character array and shift the elements to the left to remove the first n characters
        for (int i = n; i < charArray.length; i++) {
            charArray[i-n] = charArray[i];
        }
        
        // Convert the character array back to a string and return it, along with the removed string
        String modifiedString = new String(charArray, 0, charArray.length - n);
        return new String[] {modifiedString, removedString};
    }
    
    public static void main(String args[])
    {
        String s;
        String n;

        System.out.println("Enter the string: ");
        s=sc.nextLine();
    
        System.out.println("Enter the element to be removed: ");
        n=sc.next();
// 1st method
        String result=s.replace(n,"");
        System.out.println(result);

// 2nd creating a function
        System.out.println("Enter the index value: ");
        int a=sc.nextInt();

      String[] res= delete(s,a);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}
