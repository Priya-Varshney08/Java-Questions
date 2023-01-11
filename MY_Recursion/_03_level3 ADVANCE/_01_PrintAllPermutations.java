import java.util.*;

public class _01_PrintAllPermutations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PrintAllPermutations(s, "");
    }
    public static void PrintAllPermutations(String s, String permutation){
        if(s.length()==0){
        System.out.println(permutation);
        return;
        }
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            PrintAllPermutations(newStr, permutation+curr);
        }
    }
}