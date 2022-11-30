import java.util.*;

public class Arrays_ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int j= n-1;
        int k = 0;
        for(int i=0; i<n/2; i++){
            int t = a[k];
            a[k] = a[j];
            a[j] = t;
            j--;
            k++;
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}