public class ArraySorted {
    public static boolean Sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return Sorted(arr, index+1);

    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,70,50,60};
        int index = 0;
        boolean result = Sorted(arr,index);
        System.out.println(result?"sorted":"not sorted");
    }
    
}
