import java.util.*;

public class helpRamu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] auto = new int[n];
            for(int i=0; i<n; i++){
                auto[i] = sc.nextInt();
            }

            int[] cab = new int[m];
            for(int i=0; i<m; i++){
                cab[i] = sc.nextInt();
            }

            int p1 = 0;
            // int p2 = n*c2;
            int v1 = 0;
            // int v2 = m*c2;
            int min1, min2;
            for(int i=0; i<n; i++){
                p1 += Math.min(auto[i]*c1, c2);
            }

            for(int i=0; i<m; i++){
                v1 += Math.min(cab[i]*c1, c2);
            }

            min1 = Math.min(p1, c3);
            min2 = Math.min(v1, c3);

            // System.out.println(min1+" "+min2);
            System.out.println(Math.min(min1+min2, c4));
            t--;
        }
    }
}