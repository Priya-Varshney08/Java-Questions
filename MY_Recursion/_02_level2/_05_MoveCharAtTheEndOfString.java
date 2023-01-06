import java.util.*;

public class _05_MoveCharAtTheEndOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        // System.out.println(ch);
        System.out.println(moveAllChar(s, ch, 0, 0, ""));
    }
    public static String moveAllChar(String s, char ch, int idx, int cnt, String newString){
        if(idx==s.length()){
            for(int i=0; i<cnt; i++){
                newString += ch;
            }
            return newString;
        }
        char curr = s.charAt(idx);
        if(curr==ch)
        cnt++;
        else
        newString += curr;
        return moveAllChar(s, ch, idx+1, cnt, newString);
    }
}