import java.util.*;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[]a = new int[n];
            int[]co = new int[2*n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                co[i] = a[i];
            }
            
            int j=0;
            for(int i=n; i<2*n; i++){
                co[i] = a[j++];
            }
            int s = 0;
            int ans = 0;

            for(int i=0; i<n; i++){
                for(int x=0;x<n;x++){
                    for(int k=x; k<=i+x; k++){
                        
                        s += co[k];
                    }
                    ans = Math.max(s, ans);
                    s=0;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}