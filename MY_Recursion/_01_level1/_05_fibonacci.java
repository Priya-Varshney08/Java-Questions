import java.util.*;

public class _05_fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        fibo(0, 1, n-2);
    }
    public static void fibo(int a, int b, int n){
        if(n==0)
        return;
        
        System.out.print(a+b + " ");
        fibo(b, a+b, n-1);
    }
}