import java.util.*;

public class StringsDifferenceInAsciiCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printDiff(s);
    }
    public static void printDiff(String s){
        for(int i=0; i<s.length()-1; i++){
            char curr = s.charAt(i);
            char nxt = s.charAt(i+1);
            System.out.print(curr);
            System.out.print(nxt-curr);
            if(i==s.length()-2)
            System.out.print(nxt);
        }
    }
}