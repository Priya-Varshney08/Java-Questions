import java.util.*;

public class Strings_CountPalindromicSubstrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CountPalindromicSubstrings(s);
    }
    public static void CountPalindromicSubstrings(String s){
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                if(isPalindromic(s.substring(i, j))==true){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPalindromic(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}