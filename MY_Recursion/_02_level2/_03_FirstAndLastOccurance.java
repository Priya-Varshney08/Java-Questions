import java.util.*;


// find first and last occurance of a character in the given string
public class _03_FirstAndLastOccurance{
    // Global Variables
    public static int first = -1;
    public static int last = -1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        findOccurance(s, ch, 0);
    }
    public static void findOccurance(String s, char ch, int idx){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=s.charAt(idx);
        if(curr==ch){
            if(first==-1)
            first=idx;
            else
            last=idx;
        }
        findOccurance(s, ch, idx+1);
    }
}