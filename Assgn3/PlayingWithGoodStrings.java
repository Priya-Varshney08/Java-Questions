import java.util.*;

public class PlayingWithGoodStrings {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        printGoodString(s);
    }

    public static void printGoodString(String s){
        int c=0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                c++;
            }
            else{
                ans = Math.max(ans, c);
                c=0;
            }
            ans = Math.max(ans, c);
        }
        System.out.println(ans);
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}