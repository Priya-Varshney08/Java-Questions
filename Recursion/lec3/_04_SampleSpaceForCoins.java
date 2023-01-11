import java.util.*;

public class _04_SampleSpaceForCoins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int coins = sc.nextInt();
        PrintAllSubsequence(coins, "");
    }

    public static void PrintAllSubsequence(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        PrintAllSubsequence(n-1, ans+"H");
        PrintAllSubsequence(n-1, ans+"T");
    }
}