import java.util.*;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            long[] b = productExcept(a);
            for(int i=0; i<n; i++){
                System.out.print(b[i]+ " ");
            }
        }
        public static long[] productExcept(long[] a) {
        int n = a.length;
    //     int lft[] = new int[n];
    //     int rgt[] = new int[n];
    //     lft[0] = 1;
    //     rgt[n-1] = 1;

    //     for(int i=1; i<n; i++){
    //         lft[i] = lft[i-1]*a[i-1];
    //     }
        
    //     for(int i=n-2; i>=0; i--){
    //         rgt[i] = rgt[i+1]*a[i+1];
    //     }
        
    //     for(int i=0; i<n; i++){
    //         a[i] = lft[i]*rgt[i];
    //     }
    //     return a;
    // }


    long[] left = new long[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = a[i - 1] * left[i - 1];
		}
		long[] right = new long[n];
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * a[i + 1];

		}
		for (int i = 0; i < n; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
        }
}