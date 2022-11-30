import java.util.*;

public class Arrays_WavePrintColumnWise {
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
        wavePrintColumnWise(a);
    }

    public static void wavePrintColumnWise(int[][] a){
        // int track=0;
        int r = a.length;
        int c = a[0].length;
        for(int col=0; col<c; col++){
            if(col%2==0){
                for(int row=0; row<r; row++){
                    System.out.print(a[row][col] + ", ");
                }
            }
            else{
                for(int row=r-1; row>=0; row--){
                    System.out.print(a[row][col] + ", ");
                }
            }

            // track++;
        }
        System.out.println("END");
    }
}