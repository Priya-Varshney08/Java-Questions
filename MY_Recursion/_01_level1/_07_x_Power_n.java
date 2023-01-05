import java.util.*;
 
// Stack height = log n
  
public class _07_x_Power_n{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculateAns(x, n));
    }
    public static int calculateAns(int x, int n){
        if(n==0)
        return 1;
        if(n%2==0)
        return calculateAns(x, n/2)*calculateAns(x, n/2);
        else
        return calculateAns(x, n/2)*calculateAns(x, n/2)*x;

    }
}