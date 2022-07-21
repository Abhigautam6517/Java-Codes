public class Alphabet2 {
    static void alphabet(int num) {
    if(num==64){
        return ;
     
    }
    int con = 65;
    alphabet(num-1);
    print(num,con);
    System.out.println();
}
static void print(int star,int con){
    if(star==con){
        return ;
    }
    char a = (char) con;
    System.out.print(a);
    print(star,con+1);
}
    public static void main(String[] args) {
        int num = 70;
        alphabet(num);
    }
}