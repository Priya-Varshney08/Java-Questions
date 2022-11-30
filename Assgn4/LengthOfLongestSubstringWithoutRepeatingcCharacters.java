import java.util.*;

public class LengthOfLongestSubstringWithoutRepeatingcCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = lonSubs(s);
        System.out.println(x);
    }
    // public static int lonSubs(String s){
    //     int si=0;
    //     int ei=0;
    //     int len = 0;
    //     Set<Character> seen = new HashSet();
    //     while(ei<s.length()){
    //         char c = s.charAt(ei);
    //         if(seen.add(c)){
    //             len = Math.max(len, ei-si+1);
    //             ei++;
    //         }
    //         else{
    //             // duplicate character mila h
    //             while(s.charAt(si)!=c){
    //                 seen.remove(s.charAt(si));
    //                 si++;
    //             }
    //             seen.remove(c);
    //             si++;
    //         }  
    //     }
    //     return len;
    // }

    public static int lonSubs(String s){
        int st = -1;
        int len = 0;
        int[] fre = new int[256];
        // for(int i=0; i<s.length(); i++){
        //     fre[s.charAt(i)]=-1;
        // }
        for(int i=0; i<s.length(); i++){
            if(fre[s.charAt(i)]>st)
                st = fre[s.charAt(i)];
            fre[s.charAt(i)]=i;
            len = Math.max(len, i-st);
        }
        return len;
    }
}