import java.util.*;

public class Arrays_TargetSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        sort(a);
        sumPair(a, sum);
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

    public static void sumPair(int[] a, int s){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] + a[j] == s){
                    System.out.println(a[i] + " and " + a[j]);
                }
            }
        }
    }
}