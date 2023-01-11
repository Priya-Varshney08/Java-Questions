import java.util.*;

public class _03_PrintAllSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "abc";
        PrintAllSubsequence(s, "");
    }

    public static void PrintAllSubsequence(String s, String nw){
        if(s.length()==0){
            System.out.println(nw);
            return;
        }
        char ch = s.charAt(0);
        PrintAllSubsequence(s.substring(1), nw);
        PrintAllSubsequence(s.substring(1), nw+ch);

    }
}