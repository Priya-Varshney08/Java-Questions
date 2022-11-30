import java.util.*;

public class SquaresOfSortedArray {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            a[i] = a[i]*a[i];
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}