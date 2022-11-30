import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        stringCompression(s);
    }
// aaabbacdd
// a4b2c1d2
    public static void stringCompression(String s){

        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char nx = s.charAt(i+1);
            if(ch==nx){
                cnt++;
            }
            if(ch!=nx){
            System.out.print(ch);
            System.out.print(cnt);
            cnt=1;
            }
        }
        System.out.print(s.charAt(s.length()-1));
        System.out.print(cnt);
    }
}