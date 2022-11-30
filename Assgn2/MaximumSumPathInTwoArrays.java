import java.util.*;

public class MaximumSumPathInTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            
            for(int i=0 ; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0 ; i<m; i++){
                b[i] = sc.nextInt();
            }
            int s1 = 0;
            int s2 = 0;
            int i=0; 
            int j= 0;
            int ans = 0;

            while(i<n && j<m){
                if(a[i]<b[j])
                    s1 += a[i++];
                else if(a[i]>b[j])  
                    s2 += b[j++];
                else{
                    ans += Math.max(s1, s2) + a[i];
                    i++;
                    j++;
                    s1 = 0;
                    s2 = 0;
                }
            }
            while(i<n)
                s1 += a[i++];
            while(j<m)
                s2 += b[j++];
            ans += Math.max(s1, s2);
            System.out.println(ans);
            t--;
        }
    }
}