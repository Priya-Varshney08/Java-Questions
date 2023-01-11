import java.util.*;

public class _01_PrintFirstOccurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 4, 7, 1, 5, 7, 0, 7};
        int element = 100000;
        System.out.println(PrintFirstOccurance(a, element, 0));
    }

    public static int PrintFirstOccurance(int[] a, int element, int idx){
        if(idx==a.length-1){    // Base case
            return -1;
        }
        if(a[idx]==element){
            return idx;
        }
        return PrintFirstOccurance(a, element, idx+1);
    }
}