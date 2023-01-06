import java.util.*;

public class _06_RemoveDuplicatesFromString{
    public static int[] fre = new int[26];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "avddxrrsdazw";
        // int[] fre = new int[26];
        System.out.println(RemoveDuplicates(s, 0, ""));
    }
    public static String RemoveDuplicates(String s, int idx, String ans){
        if(idx==s.length()){    //base case
        return ans;
        }

        fre[s.charAt(idx)-'a']++;
        char curr=s.charAt(idx);
        if(fre[curr-'a']==1)
        ans += curr;
        return RemoveDuplicates(s, idx+1, ans);
        
    }
}