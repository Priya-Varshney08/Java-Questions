import java.util.*;

public class _07_PrintAllSubsequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PrintSubsequences(s, 0, "");

    }
    public static void PrintSubsequences(String s, int idx, String ans){
        if(idx==s.length()){    //base case
        System.out.println(ans);
        return ;
        }
        char curr=s.charAt(idx);
        // choose to be
        PrintSubsequences(s, idx+1, ans+curr);
        // choose not to be
        PrintSubsequences(s, idx+1, ans);
    }
}