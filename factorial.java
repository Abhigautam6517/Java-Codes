public class factorial {
    public static int fact(int num,int sum){
        if(num==1){
            return sum;
        }
        sum = sum*num;
        return fact(num-1, sum);


    }
    public static void main(String[] args) {
        int num = 5;
        int sum = 1;
        int result = fact(num,sum);
        System.out.println(result);
    }
    
}
