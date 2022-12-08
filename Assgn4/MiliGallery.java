import java.util.*;

public class MiliGallery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0; i<n; i++){
        //     a[i] = sc.nextInt();
        // }
        // int[] a = {1, 0, 0, 0, 0, 1};
        int[] a = {1, 0, 0, 0, 0, 1, 0, 1, 0, 0};
        // int[] a = {0, 0, 1, 0, 0, 1, 0, 1, 0, 0};
        int k = sc.nextInt();
        System.out.println(MiliGallery(a, k));
    }

    public static boolean MiliGallery(int[] a, int k){
        int n = a.length;
        int cnt = 0;
        if(a[0]==0 && a[1]==0){
            cnt++;
            a[0]=1;
        }
        for(int i=1; i<n-1; i++){
            if(a[i-1]==0 && a[i]==0 && a[i+1]==0){
                cnt++;
                if(cnt==k){
                    return true;
                }
                a[i]=1;
            }
        }
        
        if(a[n-2]==0 && a[n-1]==0){
            a[n-1]=1;
            cnt++;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
        if(cnt>=k)
        return true;
        return false;
    }
}