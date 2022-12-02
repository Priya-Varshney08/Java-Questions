import java.util.*;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        // char[][] a = new char[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         a[i][j] = sc.next().charAt(0);
        //    }
        // }
        char[][] a = {{'.', '.', '*', '.'}, {'.', '#', '.', '.'}, {'*', '*', '.', '.'}, {'.', '#', '*', '*'}};
        PiyushAndMagicalPark(a, k, s);
    }

    public static int PiyushAndMagicalPark(char[][] a, int k, int s){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    if(j!=a[0].length-1 && a[i][j]!='#'){
                        s--;
                    }
                    if(k<s){
                        if(a[i][j]=='.'){
                            s-=2;
                        }
                        else if(a[i][j]=='*'){
                            s+=5;
                        }
                        else if(a[i][j]=='#'){
                            // continue;
                            j=a[0].length;
                        }
                    }
                    else{
                        System.out.print("No");
                        return 0;
                    }
                }
            }
            System.out.println("Yes");
            System.out.println(s);
            return 0;
    }
}