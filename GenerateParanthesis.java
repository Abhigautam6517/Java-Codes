import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
        helper(n,n,"",res);
        return res;
    }
    private static void helper(int open,int close, String s, List<String>res){
        if(open == 0 && close == 0){
            res.add(s);
            return;
        }
        if(open != 0){
            helper(open-1,close,s+"(",res);
        }
        if(close > open){
            helper(open,close-1,s+")",res); 
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateParenthesis(n));

        
    }
    
}
