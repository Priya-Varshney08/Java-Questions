import java.util.*;

public class a_Power_b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculate(a, b));
    }

    public static int calculate(int a, int b){
        // if(b==1)
        // return a;
        // if(b%2==0)
        // return calculate(a, b/2)*calculate(a, b/2);
        // else
        // return a*calculate(a, b/2)*calculate(a, b/2);
        if(b==1)
        return a;
        return a*calculate(a, b-1);
    }
}