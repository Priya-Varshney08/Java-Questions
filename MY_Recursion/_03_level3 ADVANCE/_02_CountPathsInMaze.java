import java.util.*;
// Count total paths in a maze to mone from (0, 0) to (m, n)
// Rule 1: You can only move downwards
// Rule 2: You can only move to right

public class _02_CountPathsInMaze{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(TotalPaths(0, 0, m, n));
    }
    public static int TotalPaths(int i, int j, int m, int n){
        if(i==m || j==n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        return TotalPaths(i+1, j, m, n) + TotalPaths(i, j+1, m, n);
    }
}