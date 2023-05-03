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