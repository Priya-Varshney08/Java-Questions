import java.util.*;

public class CalculateTheSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            s += a[i];
        }
        int op = sc.nextInt();
        while(op>0){
            int w = sc.nextInt();
            s*=2;
            op--;
        }
        System.out.println(s);
    }
}