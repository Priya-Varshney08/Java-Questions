import java.util.*;

public class Corners{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0; i<n; i++){
        //     a[i] = sc.nextInt();
        // }
        int[] a = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(Corners(a));
    }
    public static int Corners(int[] a){
        int len = 0;
        int cnt = 1;
        for(int i=0; i<a.length; i++){
            cnt=1;
            int el = i;
            // int el = a[i];
            while(a[el]!=i){
                cnt++;
                el = a[el];
            }
            len = Math.max(len, cnt);
        }
        return len;
    }
}