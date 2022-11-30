import java.util.*;

public class SubarraysHavingProductlessthan_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = SubarraysHavingProductlessthan_k(a, k);
        System.out.println(x);
    }

    public static int SubarraysHavingProductlessthan_k(int[] a, int k){
        int cnt = 0;
        int si=0;
        int ei=0;
        int p = 1;
        while(ei<a.length){
            // grow
            p*=a[ei];
            // shrink
            while(p>=k && si<=ei){
                p/=a[si];
                si++;
            }
            cnt += ei-si+1;
            ei++;
        }
        return cnt;

    }
}