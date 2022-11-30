import java.util.*;
// not complete
public class MinimumWindowSizeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = minimumWindow(s, t);
        System.out.println(ans);
    }

    public static String minimumWindow(String s, String t){
        int[] fret = new int[123];
        // store the frequency of string t 
        for(int i=0; i<t.length(); i++){
            fret[t.charAt(i)]++;
        }
        int[] fres = new int[123];

        int si=0;
        int ei=0;
        int cnt=0;
        int len = Integer.MAX_VALUE;
        while(ei<s.length()){
            char ch = s.charAt(ei);
            fres[ch]++;
            if(fret[ch]>0){
                fret[ch]--;
            }
        }
    }
}