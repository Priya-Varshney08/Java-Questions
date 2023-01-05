import java.util.*;
// print decreasing
public class _01_PrintDecreasing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printDecreasing(x);
    }
    public static void printDecreasing(int x){
        if(x==0)        // Base Case
        return;
        System.out.println(x);
        printDecreasing(x-1);
    }
}