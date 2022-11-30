import java.util.*;

public class RainWaterTrapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println(rainWater(a));
            t--;
        }
    }

    public static int rainWater(int[] a){
        int n = a.length;
        int[] l_max = new int[n];
        int[] r_max = new int[n];
        l_max[0] = a[0];
        r_max[n-1] = a[n-1];

        for(int i=1; i<n; i++){
            l_max[i] = Math.max(a[i], l_max[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            r_max[i] = Math.max(a[i], r_max[i+1]);
        }
        int s = 0;
        for(int i=0; i<n; i++){
            s += Math.min(l_max[i], r_max[i]) - a[i];
        }
        return s;
    }
}