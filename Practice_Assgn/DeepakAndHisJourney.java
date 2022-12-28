import java.util.*;

public class DeepakAndHisJourney{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            int n = sc.nextInt();
            long[] cost = new long[n];
            for(int i=0; i<n; i++){
                cost[i] = sc.nextInt();
            }
            long[] petrol = new long[n];
            for(int i=0; i<n; i++){
                petrol[i] = sc.nextInt();
            }
            long ans = 0;
            long mny = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                if(cost[i]<mny){
                    mny = cost[i];
                    ans += mny*petrol[i];
                }
                else{
                    ans += mny*petrol[i];
                }
            }
            System.out.println(ans);
        }
    }
}