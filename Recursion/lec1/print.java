import java.util.*;

public class print{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            print(n-1);
        }
    }
}