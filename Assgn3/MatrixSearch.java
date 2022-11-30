import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int el = sc.nextInt();
        matrixSearch(a, el);
    }

    public static void matrixSearch(int[][] a, int el){
        int r = a.length;
        int c = a[0].length;
        int idx = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(a[i][j]==el){
                    idx = 1;
                }
            }
        }
        System.out.println(idx);
    }
}