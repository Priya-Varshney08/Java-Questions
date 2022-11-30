import java.util.*;

public class ChangeElementsIn2DMatrix {
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
        ChangeElementsin2DMatrix(a);
    }

    public static void ChangeElementsin2DMatrix(int[][] a){
        int r = a.length;
        int c = a[0].length;

        int x=1, y=1;
        for(int i=0; i<r; i++){
            if(a[i][0]==0){
                y=0;    // means that 0 is present in first column
            }
        }        
        for(int i=0; i<c; i++){
            if(a[0][i]==0){
                x=0;    // means that 0 is present in first row
            }
        }        

        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }

        for(int i=1; i<c; i++){     
            if(a[0][i]==0){
                for(int j=1; j<r; j++){
                    a[j][i]=0;
                }
            }
        }
        for(int i=1; i<r; i++){     
            if(a[i][0]==0){
                for(int j=1; j<c; j++){
                    a[i][j]=0;
                }
            }
        }

        if(x==0){           
            for(int i=0; i<c; i++){
                a[0][i]=0;
            }
        }
        if(y==0){           
            for(int i=0; i<r; i++){
                a[i][0]=0;
            }
        }



        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}