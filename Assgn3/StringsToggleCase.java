import java.util.*;

public class StringsToggleCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        toggleCase(s);
    }

    public static void toggleCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                System.out.print((char)(ch+32));
            }
            else if(ch>=97 && ch<=122){
                System.out.print((char)(ch-32));
            }
        }
    }
}