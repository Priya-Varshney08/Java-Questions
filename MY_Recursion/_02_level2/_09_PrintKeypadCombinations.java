import java.util.*;

public class _09_PrintKeypadCombinations{
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PrintCombinations(s, 0, "");
    }
    public static void PrintCombinations(String s, int idx, String combination){
        if(idx==s.length()){
            System.out.println(combination);
            return;
        }
        char num = s.charAt(idx);
        String set = keypad[num-'0'];
        for(int i=0; i<set.length(); i++){
            PrintCombinations(s, idx+1, combination+set.charAt(i));
        }
            // PrintCombinations(s, idx+1,, combination)
    }
}