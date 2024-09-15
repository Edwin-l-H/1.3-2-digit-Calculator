import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //This part handles the input
        System.out.println("Welome to my calculator!");
        System.out.println("Enter your first number.");
        Scanner s = new Scanner(System.in);
        double first = s.nextDouble();
        System.out.println("What operation would you like to do?");
        String operation = s.next();
        System.out.println("Enter your second number.");
        double second = s.nextDouble();


        //This part handles addition
        if(operation.equals("+")||operation.equals("add")||operation.equals("addition"))
        {
            System.out.println("Answer: " + (first + second));
        }


        //This part handles subtraction
        if (operation.equals("-")||operation.equals("subtract")||operation.equals("subtraction"))
        {
            System.out.println("Answer: " + (first - second));
        }
        

        //This part handles multiplication
        if (operation.equals("*")||operation.equals("Multiple")||operation.equals("Multiplication"))
        {
            System.out.println("Answer: " + (first * second));
        }
        
        
        //This part handles divison
        if (operation.equals("/")||operation.equals("Divide")||operation.equals("Division"))
        {
            //This part handles a divide by 0 situtation
            if (second == 0)
            {
                System.out.println("You have a divide by 0 error");
            }
            
            //This part handles when there isn't a divide by 0 situtation
            else
            {
                System.out.println("Answer: " + (first / second));
            }
        }

        s.close();
    }
}