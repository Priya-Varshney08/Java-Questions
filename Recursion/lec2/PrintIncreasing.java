import java.util.*;

public class PrintIncreasing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        PrintIncreasing(n);
    }
    
    // public static void printNums(int x, int n){
    //     if(x==n+1)
    //     return;
    //     System.out.println(x);
    //     printNums(x+1, n);
    // }

    public static void PrintIncreasing(int n){
        if(n==0){
        return;
        }
        PrintIncreasing(n-1);       //recursive call k baad statement h -> head recursion othw tail recursion
        System.out.println(n);
    }
}