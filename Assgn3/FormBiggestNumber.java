import java.util.*;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int k=0; k<n; k++){
                a[k] = sc.nextInt();            
            }
            myCompare(a);
        }
    }

    public static void myCompare(int[] a){
        int n = a.length;
        String[] arr = new String[n];
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                String substr = String.valueOf(a[i]);
                String num = String.valueOf(a[j]);
                if((num+substr).compareTo(substr+num)>0){
                    s(a, i, j);
                }
            }
        }
        String nw = "";
        for(int i=0; i<n; i++){
            nw += a[i];
        }
        System.out.println(nw);
    }

    public static void s(int[]a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}