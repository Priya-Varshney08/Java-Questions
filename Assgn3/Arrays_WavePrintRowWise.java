import java.util.*;

public class Arrays_WavePrintRowWise {
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
        wavePrintRowWise(a);
    }

    public static void wavePrintRowWise(int[][] a){
        int r = a.length;
        int c = a[0].length;
        int row =0;
        for(int i=0; i<r; i++){
            if(row%2==0){
                for(int j=0; j<c; j++){
                    System.out.print(a[i][j] + ", ");
                }
            }
            else{
                for(int j=c-1; j>=0; j--){
                    System.out.print(a[i][j] + ", ");
                }
            }
            row++;
        }
        System.out.println("END");
    }
}