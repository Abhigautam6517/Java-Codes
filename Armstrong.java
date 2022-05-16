public class Armstrong {
    public static void main(String[] args) {
        
    int num = 153;
    int copy = num;
    int sum = 0;
    while(num!=0){
        int digit = num%10;
        sum = sum + (digit*digit*digit);
       num = num/10;
    }
    if(copy==sum){
        System.out.println("This number is Armstrong number");
    }
    else{
        System.out.println("this number is not Armstrong number");
    }
    }
    
}
