import java.util.*;
// print Increasing
public class _02_PrintIncreasing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printIncreasing(1, x);
    }
    public static void printIncreasing(int cnt, int x){
        if(cnt==x+1)        // Base Case
        return;
        System.out.println(cnt);
        cnt+=1;
        printIncreasing(cnt, x);
    }
}