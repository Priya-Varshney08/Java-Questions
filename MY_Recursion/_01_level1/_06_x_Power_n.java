import java.util.*;
 
// Stack height = n
  
public class _06_x_Power_n{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculateAns(x, n));
    }
    public static int calculateAns(int x, int n){
        if(n==0)
        return 1;
        return x*calculateAns(x, n-1);
    }
}