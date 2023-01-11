import java.util.*;
import java.util.HashSet;

public class _08_PrintAllUniqueSubsequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        PrintUniqueSubsequences(s, 0, "", set);
    }
    
    public static void PrintUniqueSubsequences(String s, int idx, String ans, HashSet<String> set){

        // we will use Hashset which will store only unique subsequences
        if(idx==s.length()){    //base case
            if(set.contains(ans)){
                return ;
            }
            else{
                System.out.println(ans);
                set.add(ans);
                return;
            }
        }
        char curr=s.charAt(idx);
        // choose to be
        PrintUniqueSubsequences(s, idx+1, ans+curr, set);
        // choose not to be
        PrintUniqueSubsequences(s, idx+1, ans, set);
    }
}