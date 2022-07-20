public class Star2 {
    public static void printLine(int num){
        if(num==0){
            return ;
        }
        printStar(num);
        System.out.println();
        printLine(num-1);
       
      
        
    

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
