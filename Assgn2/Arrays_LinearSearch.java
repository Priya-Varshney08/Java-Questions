import java.util.*;

public class Arrays_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int el = sc.nextInt();
        System.out.println(search(a, el));
        
    }
    public static int search(int[] a, int el){
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i]==el){
                return i;
            }
        }
        return -1;
    }
}