public class StockBuySell1 {
    public static int stck1(int[] arr,int n){
        int min = 0;
        int maxprofit = 0;
        for(int i = 0;i<n;i++){
            min = Math.min(min, arr[i]);
            int profit = arr[i]-min;
            maxprofit = Math.max(maxprofit, profit);
            
            
        }
        return maxprofit;
        

    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,7,8,2,9,4,9};
        int n = arr.length;
        stck1(arr,n);
    }
    
}
