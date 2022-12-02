import java.util.*;

public class NewbieStockTrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(NewbieStockTrader(a));
    }

    public static int NewbieStockTrader(int[] a){
        int n = a.length;
        int max=1;
        int len = 1;
        for(int i=1; i<n; i++){
            if(a[i]>a[i-1])
                len++;
            else{
                max=Math.max(max, len);
                len=1;
            }
        }
        max=Math.max(max, len);
        return max;

    }
}