import java.util.*;

public class AverageofSlidingWindows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(n);
        while(n>=0){
            n = sc.nextInt();
            if(n>=0)
            a.add(n);
        }

        int[] b = new int[a.size()];
        for(int i=0; i<b.length; i++){
            b[i]=a.get(i);
        }


        // for(int i=0; i<a.size(); i++){
        //     System.out.print(a.get(i) + " ");
        // }

        // 51                               -> 51.0000
        // 51+62                            -> 56.5000
        // 51+62+24                         -> 45.6667 
        // 51+62+24+51                      -> 47.0000
        // 51+62+24+51+79                   -> 53.4000
        //    62+24+51+79+33                -> 49.8000
        //       24+51+79+33+72             -> 51.8000
        //          51+79+33+72+78          -> 62.6000
        //             79+33+72+78+84       -> 69.2000
        //                33+72+78+84+42    -> 61.8000


        // 51+62+24+51+79+33+72+78+84+42
        avgOfWindow(b, k);
    }

    public static void avgOfWindow(int[] a, int k){
        int si=0;
        int ei=0;
        int i=0;
        int sum=0;
        while(ei<a.length){
            sum += a[ei];
            while((ei-si+1)>k && si<=ei){
                sum-=a[si];
                si++;
            }
            double x = (float)sum/(ei-si+1);
            System.out.format("%.4f ", x);
            ei++;
        }
        
    }
}