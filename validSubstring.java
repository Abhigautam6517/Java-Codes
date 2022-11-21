public class validSubstring {

        static int findMaxLen(String S) {
            // code here
            int open = 0;
            int ans = 0;
            int close = 0;
            for(int i=S.length()-1;i>=0;i--) {
                char ch = S.charAt(i);
                if(ch=='(') {
                    if(open==close) {
                        open = close = 0;
                    }
                    else
                    open++;
                }
                else {
                    close++;
                }
                if(open==close)
                ans = Math.max(ans,2*open);
            }
            open = 0;
            close = 0;
            for(int i=0;i<S.length();i++) {
                char ch = S.charAt(i);
                if(ch==')') {
                    if(open==close)
                    open = close = 0;
                    else
                    close++;
                }
                else
                open++;
                if(open==close)
                ans = Math.max(ans,2*open);
            }
            return ans;
        }
    };
    

