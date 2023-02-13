public class Throw
{
    public static void main(String[] args)
    {
        try
        {
            throw new ArithmeticException("Demo");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught"+e);
        }
    }
}
