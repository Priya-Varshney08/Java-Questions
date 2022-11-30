import java.util.*;

public class Arrays_TargetSumTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        sort(a);
        sumTriplet(a, sum);
    }
    public static void sort(int[] a){
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
    }

    public static void sumTriplet(int[] a, int s){
        int n = a.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(a[i] + a[j] + a[k] == s){
                        System.out.println(a[i] + ", " + a[j] + " and " + a[k]);
                    }
                }
            }
        }
    }
}