import java.util.*;

public class Strings_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringCompression(s);
    }

    public static void StringCompression(String s){
        int[] fre = new int[26];
        boolean[] alph = new boolean[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            fre[ch-97]++;
            alph[ch-97] = true;
        }
        // int m=0;
        for(int i=0; i<26; i++){
            if(alph[i]==true){
                System.out.print((char)(i+97));
                alph[i]=false;
            }
            if(fre[i]>1){
                System.out.print(fre[i]);
            }
        }
    }
}