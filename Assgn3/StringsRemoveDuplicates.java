import java.util.*;

public class StringsRemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        RemoveDuplicates(s);
    }

    public static void RemoveDuplicates(String s){
        String nw = "";
        for(int i=0; i<s.length()-1; i++){
            char curr = s.charAt(i);
            char nxt = s.charAt(i+1);
            if(curr!=nxt){
                nw = nw + curr;
            }
            if(i==s.length()-2){
                if(curr!=nxt){
                    nw = nw + nxt;
                }
            }
        }
        System.out.println(nw);
    }
}