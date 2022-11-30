import java.util.*;

public class ArraysSumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
            int i=a.length-1;
            int j = b.length-1;
            ArrayList<Integer> list = new ArrayList<>();
            int carry=0;
            while(i>=0 && j>=0){
                int s =0;
                s+=a[i]+b[j]+carry;
                list.add(s%10);
                carry=s/10;
                i--;
                j--;
            }
            while(i>=0){
                int s =0;
                s+= a[i]+carry;
                list.add(s%10);
                carry = s/10;
                i--;
            }
            while(j>=0){
                int s =0;
                s+= b[j]+carry;
                list.add(s%10);
                carry = s/10;
                j--;
            }
            if(carry!=0){
                list.add(carry);
            }
        
         for(int k=list.size()-1; k>=0; k--){
                System.out.print(list.get(k)+ ", ");
            }
            System.out.println("END");
    }
}