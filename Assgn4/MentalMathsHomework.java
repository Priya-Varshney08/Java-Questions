import java.util.*;

public class MentalMathsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0; i<n; i++){
        //     a[i] = sc.nextInt();
        // }
        // int[] a = {-1, -4, -2, 2, 4, 0};
        int[] a = {-1, -2, 3, -4, 5};
        System.out.println(MentalMathsHomework(a));
    }

    // public static int MentalMathsHomework(int[] a){
    //     int n = a.length;
    //     int max_product = Integer.MIN_VALUE;
  
    //     for (int i = 0; i < n - 2; i++){
    //         for (int j = i + 1; j < n - 1; j++){
    //             for (int k = j + 1; k < n; k++){
    //                 max_product = Math.max(max_product,a[i] * a[j] * a[k]);
    //             }
    //         }
    //     }
    //     return max_product;
    //     }

    public static int MentalMathsHomework(int[] a){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        int m=Integer.MIN_VALUE;
        m = Math.max(m, a[0]*a[1]*a[n-1]);
        m = Math.max(m, a[n-1]*a[n-2]*a[n-3]);
        return m;
    }
}