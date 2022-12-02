import java.util.*;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[] a = new int[r*c];
        for(int i=0; i<r*c; i++){
            a[i] = sc.nextInt();
        }

        int ro = sc.nextInt();
        int col = sc.nextInt();
        reshape(a, r, c , ro, col);
    }

    public static void reshape(int[] a, int r, int c, int ro, int col){
        int[][] b;
        int m=0;
        if(r*c!=ro*col){
            b = new int[r][c];
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    b[i][j] = a[m++];
                }
            }
        }
        else{
            b = new int[ro][col];
            // int m=0;
            for(int i=0; i<ro; i++){
                for(int j=0; j<col; j++){
                    b[i][j] = a[m++];
                }
            }
        }
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}