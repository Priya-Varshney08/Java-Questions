import java.util.*;

public class canYouReadThis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char f = s.charAt(0);
        System.out.println(f);
        printWords(s);

    }

    public static void printWords(String s){
        for(int i=1; i<s.length(); i++){
            char cpr = s.charAt(i-1);
            char cnx = s.charAt(i);
            if((cpr>=97 && cpr<123) && (cnx>=65 && cnx<91)){
                System.out.println(cpr);
            }
            else{
                System.out.print(cpr);
            }
        }
    }
}