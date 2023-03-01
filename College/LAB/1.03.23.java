
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

// Using Yield, top,sleep
public class Threading_yield_run {
    
    public class A extends Thread
    {
        public void run()
        {
             
            for(int i=1;i<=5;i++)
            {
                if(i==1)
                {
                Thread.yield();
                System.out.println("\tFrom Thread A: "+i);
                }
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
                if(i==3) stop();    
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
                
                System.out.println("\tFrom Thread C: "+i);
                if(i==3)
                {
                    try
                    {
                        sleep(10000);
                    }
                    catch(Exception e)
                    {

                    }
                }    
            }
            System.out.println("Exit from C");
        }
    }

    public static void main(String[] args)
    {
        Threading_yield_run a=new Threading_yield_run();
        System.out.println("Start Thread A");
        a.new A().start();
        System.out.println("Start Thread B");
        a.new B().start();
        System.out.println("Start Thread C");
        a.new C().start();

        System.out.println("End of Main Thread");
    }

    


}

