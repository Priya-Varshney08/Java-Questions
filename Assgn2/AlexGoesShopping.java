import java.util.*;

public class AlexGoesShopping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while(t>0){
            int c = sc.nextInt();
            int d = sc.nextInt();
            int s = 0;
            for(int i=0; i<n; i++){
                if(c%a[i]==0)
                    s++;
            }
            // System.out.println(s);
            if(s>=d)
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}