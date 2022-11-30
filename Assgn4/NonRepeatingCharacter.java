import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            if(NonRepeatingCharacter(s)==-1)
            System.out.println("-1");
            else{
                int x = NonRepeatingCharacter(s);
                System.out.println((char)x);
            }
            t--;
        }
    }

    public static int NonRepeatingCharacter(String s){
        int[] fre = new int[123];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            fre[ch]++;
        }
        for(int i=0; i<s.length(); i++){
            if(fre[s.charAt(i)]==1){
                return (int)s.charAt(i);
            }
        }
        return -1;
    }

}