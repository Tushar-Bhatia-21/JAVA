import java.lang.Math;
import java.util.Scanner;

class compute
    {
        void COMP(double a,double b, double c,double Discriminant) throws myexception
        {
        if(Discriminant<0)
        {
            throw new myexception(Discriminant);
        }
        else if(Discriminant==0)
        {
            System.out.println("Roots are equal.");
            System.out.println("Root is: "+(-b/2*a));
        }
        else
        {
            System.out.println("Roots are unequal and real");
            System.out.println("Root 1 is: "+((-b/2*a)+(Math.sqrt(Discriminant))/2*a));
            System.out.println("Root 2 is: "+((-b/2*a)-(Math.sqrt(Discriminant))/2*a));
        }
        }
    }

    class myexception extends Exception
    {
        myexception(double d)
        {
            System.out.println("Discriminant cannot be negative");
        }
    }
public class Custom_exception_file {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        compute B= new compute();
        double a=0,b=0,c=0;
        double Discriminant=0;
        
        System.out.println("Enter the value of constant A: ");
        a=sc.nextDouble();
        System.out.println("Enter the value of constant B: ");
        b=sc.nextDouble();
        System.out.println("Enter the value of constant C: ");
        c=sc.nextDouble();

        System.out.println("The equation is: "+a+"x^2+"+b+"x+"+c);

        Discriminant=b*b-4*a*c;
        try{
        B.COMP(a,b,c,Discriminant);
        }
        catch(Exception e){
            System.out.println("ERORR!!!!!!!!!!!!!!\n"+e);
        }
        
    }
}

// SHAPE PAPER

import java.util.Scanner;

public class Shape_paper {

    static Scanner sc=new Scanner(System.in);
    public interface A
    {
        public void compute();
    }
    class Cuboid implements A
    {
        public void compute()
        {
            System.out.println("Cuboid has 6 sides");
        }
    }

    class Rectangle implements A
    {
        public void compute()
        {
            System.out.println("Rectange is a side of a cuboid");
        }
    }

    public static void main(String[] args)
    {
        Shape_paper A= new Shape_paper();
        Cuboid B= A.new Cuboid();
        B.compute();
        Rectangle C= A.new Rectangle();
        C.compute();
    }

}
