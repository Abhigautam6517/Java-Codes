public class MaxSumPathArray {
    static int maxPathSum(int ar1[], int ar2[] ,int m, int n)
    {

        int i = 0;
        int j = 0;
        int sum1 = 0;
        int res = 0;
        int sum2 = 0;
        while(i<m && j<n){
            if(ar1[i]<ar2[j]){
                sum1+=ar1[i];
                i++;
            }
            else if(ar1[i]>ar2[j]){
                sum2+=ar2[j];
                j++;
            }
            else{
                res =res+ max(sum1,sum2);
                sum1 = 0;
                sum2=0;
                while(ar1[i]==ar2[j] && i<m && j<n){
                    res=res+ar1[i];
                    i++;
                    j++;
                }
                
            }
            
    while(i<m){
    int[] a;
    sum1+=a[i++];
    }
    while(j<n){
    int[] b;
    sum2+=b[j];
    j++;
    
    }

    res=res+max(sum1,sum2);
    return res;
            
            

    }
}


    private static int max(int sum1, int sum2) {
        return 0;
    }


    public static void main(String[] args) {
     
        int A[] = {1,2,3};
        int B[] = {3,4,5};
        int m = A.length;
        int n = B.length;
        maxPathSum( A, B, m, n);    


}
}