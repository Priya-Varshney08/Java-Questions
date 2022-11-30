import java.util.*;

public class Strings_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));
    }

    public static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        for(int k=0; k<s.length()/2; k++){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}