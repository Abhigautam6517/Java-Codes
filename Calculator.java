import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your *,+,/,-");
        char symbol = sc.next().charAt(0);
        System.out.println("Enter your Second number");
        int secondNumber = sc.nextInt();
        sc.close();        
        if(symbol=='+'){
            int add = firstNumber+secondNumber;
            System.out.println("Add number"+add);
        }
        else if(symbol=='-'){
            int sub = firstNumber-secondNumber;
            System.out.println("Sub are"+sub);
        }
        else if(symbol=='*'){
            int mul = firstNumber*secondNumber;
            System.out.println("mul are"+mul);
        }
        else if(symbol=='/'){
            int div = firstNumber/secondNumber;
            System.out.println("Sub are"+div);
        }


        

    }

    
}
