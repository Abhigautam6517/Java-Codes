

public class PrimeNumber {
    static boolean prime(int num, int div,int stop){
        if(div==stop){
            return true;
        }
        if(num%div==0){
            return false;
        }
        return prime(num, div+1, stop);
    }
    public static void main(String[] args) {
        int num = 3;
        int div = 2;
        int stop = num-1;
        boolean result = prime(num,div,stop);
        System.out.println(result?"Yes Its Prime Number":"No it not prime number");
    }
    
}
