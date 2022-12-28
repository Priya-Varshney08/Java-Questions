import java.util.*;
// binary search laga h isme
public class LocalMaxima{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(LocalMaxima(a));
    }

    public static int LocalMaxima(int[] a){
        int n = a.length;
        int low = 0;
        int mid;
        int high = n-1;
        while(low<=high){
            mid = (low+high)/2;
            if((mid==n-1 || a[mid+1]<a[mid]) && (mid==0 || a[mid]>a[mid-1])){
                return mid;
            }
            else if(mid>0 && a[mid-1]>a[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}