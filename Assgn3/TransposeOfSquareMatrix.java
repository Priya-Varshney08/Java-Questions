import java.util.*;

public class TransposeOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        PrintTranspose(a);
    }

    public static void PrintTranspose(int[][] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}