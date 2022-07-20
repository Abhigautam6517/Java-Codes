public class DecimalToBinary {
    public static String decimal(int num,String binary){
        if(num==0){
            return binary;
        }
        int rem = num%2;
        binary=String.valueOf(rem)+binary;
        return decimal(num/2,binary);
    }
    
    public static void main(String[] args) {
        String binary = "";
        int num = 100;
        String s= decimal(num,binary);
        System.out.println(s);
    }
    
}
