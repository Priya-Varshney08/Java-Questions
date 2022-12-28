import java.util.*;

public class kebParticles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] ans = kebParticles(a);
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] kebParticles(int[] a){
        int n = a.length;
        int[] b = new int[n];
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n-1] = 1;
        for(int i=1; i<n; i++){
            left[i] = left[i-1]*a[i-1];
        }
        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1]*a[i+1];
        }
        for(int i=0; i<n; i++){
            b[i] = left[i]*right[i];
        }
        return b;
    }
}