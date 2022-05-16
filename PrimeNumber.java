public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100;
        for(int i = 2;i<=num;i++){
            if(num%i==0){
                System.out.println("yes this number is prime");
                break;
            }
            else{
                System.out.println("this number is not prime");
                break;
            }

        }

    }
    
}
