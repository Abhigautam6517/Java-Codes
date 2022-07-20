public class SumofDigit {
    public static int digit(int start,int end, int sum){
        if(start-1==end){
            return sum;
        }
        sum=sum+start;
        return digit(start+1, end, sum);


    }
    public static void main(String[] args) {
        int start = 1;
        int sum  = 0;
        int end = 5;
        int result = digit(start,end,sum);
        System.out.println("your sum is"+"-"+ +result);
    }
    
}
