public class Armstrong {
    static int check(int num,int sum){
        if(num==0){
            return sum;

        }
       
        int digit = num%10;
        int cube =  (digit*digit*digit);
        sum = sum+cube;
        int rem = num/10;
        return check(rem,sum);




    }
    public static void main(String[] args) {
        int num = 153;
        int armstrong = check(num,0);
        System.out.println(num==armstrong?"armstrong":"not");
    }

    
}