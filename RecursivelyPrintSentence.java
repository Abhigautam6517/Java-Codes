public class RecursivelyPrintSentence {


    static final int R= 3;
    static final int C =3;
    static void printUtil(String [][]arr,
                        int m, int n,
                        String []output)
    {
    output[m] = arr[m][n];
    if (m == R - 1)
    {
        for (int i = 0; i < R; i++)
        System.out.print(output[i] + " ");
        System.out.println();
        return;
    }
    for (int i = 0; i < C; i++)
        if (arr[m + 1][i] != "" && m < C)
        printUtil(arr, m + 1, i, output);
    }
    static void print(String [][]arr)
    {
    String []output = new String[R];
    for (int i = 0; i < C; i++)
        if (arr[0][i] != "")
        printUtil(arr, 0, i, output);
    }
    
    public static void main(String[] args)
    {
    String [][]arr = {{"you", "we", ""},
                        {"have", "are", ""},
                        {"sleep", "eat", "drink"}};
    print(arr);
    }
    }

