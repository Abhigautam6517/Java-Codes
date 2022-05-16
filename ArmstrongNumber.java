public class ArmstrongNumber {
    public static void main(String[] args) {
       
        for(int i = 1;i<=1000;i++){
            int copy = i;
            int sum = 0;
            while(copy!=0){
                int d= copy%10;
                sum = sum+(d*d*d);
                copy = copy/10;


            }
            if(i==sum){
                System.out.println("this number is Armstrong"+i);
            }
            else{
                System.out.println("this number is not armstrong"+i);
            }
        }
        
    }
    
}
