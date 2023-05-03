
public class Multi_threading {
    public class A extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("\tFrom Thread A: "+i);
            }
        System.out.println("Exit from A");
        }
    }

    public class B extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("\tFrom Thread B: "+i);
            }
        System.out.println("Exit from B");
        }
    }
    
    public class C extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("\tFrom Thread B: "+i);
            }
        System.out.println("Exit from B");
        }
    }

    public static void main(String[] args)
    {
        Multi_threading a=new Multi_threading();
        a.new A().start();
        a.new B().start();
        a.new C().start();
    }


}
