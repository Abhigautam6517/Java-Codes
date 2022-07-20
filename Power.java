public class Power {
    public static int pow(int num,int p,int sum){
        if(p==0){
            return sum;
        }
        sum = sum*num;
        return pow(num, p-1, sum);


    }
    public static void main(String[] args) {
        int num = 2;
        int p = 3;
        int sum = 1;
        int result = pow(num,p,sum);
        System.out.println(result);
    }
    
}
