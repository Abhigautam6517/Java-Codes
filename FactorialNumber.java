public class FactorialNumber {
    public static int factorial(int num){
       int fact = 1;
       if(num==0){
        return 1;
       }
       for(int i = 1;i<num+1;i++){
        fact = fact*i;
       }
    return fact;
        
    }
    public static void main(String[] args) {
        int number  = 6;
        System.out.println(factorial(number));
    }
}
