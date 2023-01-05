import java.util.*;
// Rules :
// only 1 disk can be transferred in 1 step
// smaller disks are always kept above the larger disks

public class _01_TowerOfHanoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // no of disks
        TowerOfHanoi(n, "S", "H", "D");

    }
    public static void TowerOfHanoi(int n, String source, String helper, String destination){
        if(n==1){
        System.out.println("Transfer disk "+ n + " from " + source +" to "+ destination);
        return;
        }

        // Step-1: Trasfer n-1 disks from source to helper
        TowerOfHanoi(n-1, source, destination, helper);
        // Step-2: Transfer nth disk from Source to destination
        System.out.println("Transfer disk "+ n + " from " + source +" to "+ destination);
        // Step-3: transfer (n-1) disks from helper(source) to destination using original source as helper
        TowerOfHanoi(n-1, helper, source, destination);
    }



    // TIme Complexity: 
    /*
    T(n) = 2*T(n-1) + 1
    T(n-1) = 2*T(n-2) + 1
    T(n-2) = 2*T(n-3) + 1
            .
            .
            .
    T(1) = 1

    T(n) = 2*[2*T(n-2) + 1] + 1         {x=1}
         = 4*T(n-2) + 2 + 1             {x=2}
         = 4*[2*T(n-3) + 1] + 2 + 1
         = 8*T(n-3) + 4 + 2 + 1         {x=3}
            (ye (n-3) ya (n-x) jab tak 1 nhi ho jata tab tak level badhate jana hai)
            n-x=1
            =>  x = n-1
         = 2^(n-1) * T(1) + 2^(n-2) + 2^(n-3) +......
         = 2^(n-1) + 2^(n-1)
    T(n) ~ 2^n
    */

}