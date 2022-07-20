public class ArraySearchElement {
    public static boolean Search(int[] arr,int index,int search){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==search){
            return true;
        }
        return Search(arr, index+1, search);

    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60,100};
        int index = 0;
        int search = 90;
        boolean result=Search(arr,index,search);
        System.out.println(result?"Yes element is found": "Not found");
    }
    
}
