import java.util.*;

public class RunningSumOfGivenArray {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int s = 0;
        for(int i=0; i<a.length; i++){
            s += a[i];
            System.out.print(s + " ");
        }
    }
}