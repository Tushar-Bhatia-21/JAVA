    public class Finally_DEMO
    {
        static void proc_A()
        {
            try
            {
                System.out.println("Inside process A");
            }
            finally
            {
                System.out.println("Finally of process A");
            }
        }
    
        static void proc_B()
        {
            try
            {
                System.out.println("Inside Process B");
            }
            finally
            {
                System.out.println("Finally of process B");
            }
        }

        static void proc_C()
        {
            try
            {
               
            }
            finally
            {
                System.out.println("Finally of process C");
            }
        }

        public static void main(String[] args)
        {
            try
            {
                proc_A();
            }
            catch(RuntimeException e)
            {
                System.out.println("Caught Exception");
            }
            proc_B();
            proc_C();
        }

    }
