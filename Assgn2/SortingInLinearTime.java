import java.util.*;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sort_N(a);
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        
    }
    public static void sort_N(int[] a){
        int n = a.length;
        int low=0, mid = 0, high = n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a, mid, low);
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] a, int s, int o){
        int t = a[s];
        a[s] = a[o];
        a[o] = t;
    }
}