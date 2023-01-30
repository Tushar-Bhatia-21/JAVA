import java.util.Scanner;
public class education_inheritance {
    
    public class Staff
    {
        String code;
        String name;
        Scanner sc=new Scanner(System.in);
        Staff()
        {
            System.out.println("Enter the name of the staff: ");
            name=sc.nextLine();
            System.out.println("Enter the code of the staff: ");
            code=sc.nextLine();
        }

        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
        }
    }

    public class typist extends Staff
    {
        int speed;
        typist()
        {
            System.out.println("Enter the speed: ");
            speed=sc.nextInt();
        }
        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
            System.out.println("Speed of the typist is: "+speed);
        }
    }

    public class regular extends typist
    {
        float salary;
        regular()
        {
            System.out.println("Enter the salary: "+salary);
            salary=sc.nextFloat();
        }
        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
            System.out.println("Speed of the typist is: "+speed);
            System.out.println("The salary is: "+salary);
        }
    }

    public class casual extends typist
    {
        float daily_wages;
        casual()
        {
            System.out.println("Enter the daily wages: ");
            daily_wages=sc.nextFloat();
        }
        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
            System.out.println("Speed of the typist is: "+speed);
            System.out.println("The daily wages are: "+daily_wages);
        }
    }

    public class officer extends Staff
    {
        int grade;
        officer()
        {
            System.out.println("Enter the grade: ");
            grade=sc.nextInt();
        }
        
        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
            System.out.println("The grade of the police officer is: "+grade);
        }
    }

    public class Teacher extends Staff
    {
        String Subject_publication;
        Teacher()
        {
            System.out.println("Enter the subject publication: ");
            Subject_publication=sc.nextLine();
        }

        void display()
        {
            System.out.println("Employee name is: "+name);
            System.out.println("Employee code is: "+code);
            System.out.println("The subject publication is: "+Subject_publication);
        }
    }

    public static void main(String args[])
    {
        int x;
        int y;
        

        education_inheritance ed1=new education_inheritance();

        Scanner sc=new Scanner(System.in);

        System.out.println("Press 1. If you are part of the staff");
        System.out.println("Press 0. If you are not the part of staff");
        x=sc.nextInt();

        if(x==1)
        {
            System.out.println("Press 1. If you are a typist\nPress 2. If you are a regular\nPress 3. If you are a casual\nPress 4. If you are a police officer\nPress 5. If you are a teacher");
            y=sc.nextInt();
            switch(y)
            {
                case 1: 
                {
                    typist ty1=ed1.new typist();
                    ty1.display();
                    break;
                }
                case 2:
                {
                    regular re1=ed1.new regular();
                    re1.display();
                    break;
                }
                case 3:
                {
                    casual ca1=ed1.new casual();
                    ca1.display();
                    break;
                }
                case 4:
                {
                    officer of1=ed1.new officer();
                    of1.display();
                    break;
                }
                case 5:
                {
                    Teacher te1=ed1.new Teacher();
                    te1.display();
                    break;
                }

                default:
                {
                    System.out.println("Invalid input");
                    break;
                }

            }

        }
        else
        {
            System.out.println("You are not the part of the staff");
            return;
        }

    }

}
