import java.util.*;
// not done
public class PeranceParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(PeranceParty(a));
    }
    // 5 4 2 6 8 9
    
    // 2 4 5 6 8 9
    // 2+5+8=15
    
    public static int PeranceParty(int[] a){
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

        int s = 0;
        for(int i=0; i<n; i+=2){
            s+=a[i];
        }
        return s;
    }
}