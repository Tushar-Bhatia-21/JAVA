public class Custom_exception {
    public class myexception extends Exception
    {
        int detail;
        myexception(int a)
        {
            detail=a;
        }
    }
    class Exception_demo
    {
       public void compute(int a) throws myexception
        {
            if(a>10)
            {
            System.out.println("Normal exit");
                throw new myexception(a);
            }
        }
    }

    public static void main(String[] args)
    {
        try{
           Custom_exception a = new Custom_exception();
           Exception_demo b= a.new Exception_demo();

            b.compute(1);
            b.compute(2);
            b.compute(30);
        }
        catch(myexception e)
        {
            System.out.println("Caught");
        }
    }
    
}
