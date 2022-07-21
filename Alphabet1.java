public class Alphabet1 {
    public static void printLine(int num){
        if(num==70){
            return ;
        }
        printStar(num);
        System.out.println();
        printLine(num+1);
      
       
    

    }
    static void printStar(int star){
        if(star==70){
            return ;
        }
        char a = (char) star;
        System.out.print(a);
        printStar(star+1);
    }
    public static void main(String[] args) {
        printLine(65);
    }
    
}
