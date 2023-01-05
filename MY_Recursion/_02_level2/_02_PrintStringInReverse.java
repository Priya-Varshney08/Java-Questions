import java.util.*;

public class _02_PrintStringInReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringReverse(s);
    }
    public static void StringReverse(String s){
        if(s.length()==1){
            System.out.print(s);
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        StringReverse(s.substring(0, s.length()-1));
    }
}