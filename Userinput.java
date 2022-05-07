import java.util.*;

public class Userinput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b= scanner.nextInt();
        int c = a+b;
        System.out.println("YOur sum is "+c);

    }
    
}
