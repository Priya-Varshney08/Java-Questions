import java.util.*;

public class nextPermutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(SYstem.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int idx1=-1;
            for(i=n-1; i>=0; i--){
                if(a[i]<a[i+1]){
                    idx1 = i;
                    break;
                }
            }
            if(idx1!=-1){
                int t = a[idx1];
                a[idx1] = a[idx1 + 1];
                a[idx1 + 1] = t;

                int m = idx1+1;
                int l = n;
                while(m<=l){
                    int te = a[m];
                    a[m] = a[l];
                    a[l] = te;
                    m++;
                    l--;
                }
                for(i=0; i<n; i++){
                    SYstem.out.print(a[i] + " ");
                }
                System.out.println();
            }
            
            

            t--;
        }
    }

    public static void reverse(int[] a, int i, int j){
        int n = a.length;
        while(i<=j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}