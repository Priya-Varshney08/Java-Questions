import java.util.*;

public class Arrays_BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int el = sc.nextInt();
        System.out.println(binarySearch(a, el));
    }

    public static int binarySearch(int[] a, int el){
        int n = a.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==el){
                return mid;
            }
            else if(el>a[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}