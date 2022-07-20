import javax.swing.text.html.HTMLDocument.RunElement;

public class ArraySearchElementLastIndex {
    public static int SearchLast(int arr[],int index,int search){
        if(index==0){
            return 0;

        }
        if(arr[index]==search){
            return index;
        }
        return SearchLast(arr, index-1, search);

    }
   public static void main(String[] args) {
    int search = 80;
    int arr[] = {10,20,30,40,50,60,80,30,100};
    int index = arr.length-1;
    int result= SearchLast(arr,index,search);
    System.out.println(result);
   }
    
}
