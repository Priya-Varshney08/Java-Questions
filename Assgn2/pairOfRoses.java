import java.util.*;

public class pairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int sum = sc.nextInt();
            int x = sum, y=0;
            // int diff = x-y;    
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i]+a[j]==sum)
                    {
                        int c = a[i];
                        int d = a[j];
                        if(c>d){
                            int te = c;
                            c = d;
                            d = te;
                        }
                        if(d-c<x-y){
                        x = d;
                        y = c;
                        }
                    }
                }  
            }
            // System.out.println("Deepak should buy roses whose prices are " + y + " and " + x + ".");
            System.out.println("Deepak should buy roses whose prices are " + y + " and " + x +".");
            t--;
        }
    }
}