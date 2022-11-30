import java.util.*;

public class InverseOfAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[]b = inverse(a);
        for(int i=0; i<n; i++){
            System.out.print(b[i] + " ");
        }
    }

    public static int[] inverse(int[] a){
        int n = a.length;
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            int el = a[i];
            b[el] = i;
        }
        return b;
    }
}