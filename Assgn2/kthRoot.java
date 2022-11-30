import java.util.*;

public class kthRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(binarySearch(n, k));
            t--;

        }
    } 
    public static long binarySearch(long n, long k){
        long low = 1;
        long high = n;
        long ans = 0;
        while(low<=high){
            long mid = (low+high)/2;
            if(Math.pow(mid, k)<=n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}