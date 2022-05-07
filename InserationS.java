public class InserationS {

    void sort(int a[]){
        int j;
        int p = a.length;
        for( j=2; j<p; j++){
            int key = a[j];
            int i = j-1;
            while(i>=0 &&  a[i]>key){
                a[i+1]= a[i];
                i=i-1;
            }
            a[i+1]= key;
        }
    
    }

    static void printArray(int a[])
    {
        int n = a.length;
        for (int j = 0; j < n; ++j)
            System.out.print(a[j] + " ");
 
        System.out.println();
    }
 
    public static void main(String[] args) {
        {
            int a[] = { 12, 11, 13, 5, 6 };
            InserationS ob = new InserationS();
            ob.sort(a);
            printArray(a);
        }
       
    }
}