public class Star {
    public static void printLine(int num){
        if(num==0){
            return ;
        }
        printLine(num-1);
        printStar(num);
        System.out.println();
    

    }
    static void printStar(int star){
        if(star==0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }
    public static void main(String[] args) {
        printLine(5);
    }
    
}
