public class BinaryDecimal {
    public static int binary(String s,int decimal,int power){
        if(s==""){
            return decimal;
            
        }
        String substring = s.substring(1);
        int digit = Character.getNumericValue(s.charAt(0));
        decimal = decimal + digit * (int) Math.pow(2, power++);
        return binary(s, decimal, power);

    }
    public static void main(String[] args) {
        String s = "1010";
        int decimal =0;
        int power = 0;
        binary(s,decimal,power);
    }
}
