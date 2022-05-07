import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        int a  = 2001;
        if(a%400==0 && a%100==0 && a%4==0){
            System.out.println("this year is leap year"+""+a);
        }
        else{
            System.out.println("This year was not leap year"+""+a);
        }
        
    }
    
}
