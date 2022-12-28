import java.util.*;

public class GudduBhaiyaJoinsKaleenBhaiyaGang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int t = sc.nextInt();
        while(t>0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int m = 0; m<k; m++){
                s = swap(s, i-1, j-1);
            }
            t--;
        }
        System.out.println(s);


        // dedfded
        // 2
        // 3 6 1
        // 1 4 2

        // dedfded
        //   3  6
        // k=1 -> operation 1 time

        // de(edfd)d

        // deedfdd
        // 1  4
        // k=2 -> operation 1 time

        // (ddee)fdd
        // (edde)fdd

    }

    public static String swap(String s, int i, int j){
        char[] arr = s.toCharArray();
        // char c = s.charAt(j);
        char c = arr[j];
        for(int k=j; k>i; k--){
            char t = arr[k-1];
            arr[k] = t;
        }
        arr[i] = c;
        String ans="";
        for(int a=0; a<arr.length; a++){
            ans+=arr[a];
        }
        // System.out.println(ans);
        return ans;
    }
}