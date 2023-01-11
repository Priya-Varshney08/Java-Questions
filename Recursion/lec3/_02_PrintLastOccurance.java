import java.util.*;

public class _02_PrintLastOccurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 4, 7, 1, 5, 7, 0, 1};
        int element = 7;
        System.out.println(PrintLastOccurance(a, element, a.length-1));
    }

    public static int PrintLastOccurance(int[] a, int element, int idx){
        if(idx==0){    // Base case
            return -1;
        }
        if(a[idx]==element){
            return idx;
        }
        return PrintLastOccurance(a, element, idx-1);
    }
}