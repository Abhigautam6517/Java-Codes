public class Numberprint2 {
    public static void print2(int num){
        if(num==0){
            return ;
        }
        print2(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 5;
        print2(num);
    }
    
}
