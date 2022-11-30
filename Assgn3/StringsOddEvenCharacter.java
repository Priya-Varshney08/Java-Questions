import java.util.*;

public class StringsOddEvenCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        oddEvenCharacter(s);
    }

    public static void oddEvenCharacter(String s){
        int idx=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(idx%2==0){
                System.out.print((char)(ch+1));
            }
            else{
                System.out.print((char)(ch-1));
            }
            idx++;
        }
    }
}