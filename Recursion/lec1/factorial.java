import java.util.*;
// Factorial of a number 
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
    public static int factorial(int n){
        // Base Case
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}