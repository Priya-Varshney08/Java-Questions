import java.util.*;

public class Strings_MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MaxFrequencyCharacter(s);
    }

    public static void MaxFrequencyCharacter(String s){
        int[] fre = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            fre[ch-97]++;
        }
        int max = 0;
        int idx = -1;
        for(int i=0; i<26; i++){
            if(fre[i]>max){
                max = fre[i];
                idx = i;
            }
        }
        System.out.println((char)(idx+97));
    }
}