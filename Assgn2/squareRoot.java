import java.util.*;

public class squareRoot {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n= sc.nextInt();
            double ans=(Math.sqrt(n));
            ans = ((long) (ans * 10000)) / 10000.0; 
            System.out.printf("%.4f%n", ans);
            t--;
        }
    }
}