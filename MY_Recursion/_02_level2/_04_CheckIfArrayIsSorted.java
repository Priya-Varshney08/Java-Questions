import java.util.*;
// check if an array is sorted(Strictly Increasing)
// valid   : 1 2 4 6 7
// Invalid : 1 2 4 6 6

public class _04_CheckIfArrayIsSorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(check(0, a));
    }
    public static boolean check(int idx, int[] a){
        int n = a.length;
        if(idx==n-1)        // Base Case
        return true;

        if(a[idx]<a[idx+1])
        return check(idx+1, a);
        else
        return false;
    }
}