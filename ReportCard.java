
import java.util.Scanner;
import java.util.prefs.PreferenceChangeEvent;

public class ReportCard {
    public static void main(String[] args) {
        int marks[]=new int[5]; 
        int sum=0;
        System.out.print("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println("Enter Your  subject marks");
        for(int i=0;i<5;i++){ 
            System.out.println("Enter Marks of Subject"+(i+1)+":");   
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
            
        }
        sc.close();
        
        System.out.println("All subject marks"+sum);
        int totalPercentage = ((sum /500)*100);
        System.out.println("Your total percentage are "+" "+ totalPercentage);
        if(totalPercentage>=90)
        {
            System.out.print("A");
        }
        else if(totalPercentage>=70 && totalPercentage<90)
        {
           System.out.print("B");
        }
        else if(totalPercentage>=50 && totalPercentage<70)
        {
           System.out.print("C");
        } 
        else
        {
           System.out.print("D Grade");
        }  
       
    }
    
    
}
