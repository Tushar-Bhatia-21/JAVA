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
