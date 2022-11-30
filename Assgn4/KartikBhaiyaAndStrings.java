import java.util.*;

public class KartikBhaiyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // String s = sc.nextLine();
        String s = "abbabaabaaa";
        int x = KartikBhaiyaAndStrings(k, s, 'a');
        int y = KartikBhaiyaAndStrings(k, s, 'b');
        System.out.println(Math.max(x, y));
    }

    // curr char = 'a'
    // checkc with a and b
    // curr char = 'b'

    public static int KartikBhaiyaAndStrings(int k, String s, char ch){
            // Sliding Window
            int si=0;
            int ei=0;
            int flip=0;
            int ans = 0;
            while(ei<s.length()){
                // window grow
                if(s.charAt(ei)==ch){
                    flip++;
                }
                // window shrink
                while(flip>k){
                    if(s.charAt(si)==ch){
                        flip--;
                    }
                    si++;
                }

            ans = Math.max(ans, ei-si+1);
            ei++;
            }
            
        return ans;
        }
}

// import java.util.*;

// public class KartikBhaiyaAndStrings {
//     public static void main(String[] args) {
//         // int a=10;
        
//     for(int i=1; i<=13; i+=3){
//         if(i==8){
//             System.out.println(i);
//             break;
//         }
//     }
//     // System.out.println(20+1.34f+"A"+"B");
//     byte x = 127;
//     x++;
//     x++;
//     // System.out.println(x);
//     int a = 14;
//     int b = 0;
//     while(a>0){
//         b+=a;
//         if(b%2==0 && b>a){
//             System.out.println(b);
//             break;
//         }
//         a--;
//     }
//     // int x<-5{
//     //     int y<-6
//     //     display(x+" "+y)
//     // }
//     // display(x+" "+y)
//     int sum = 0;
//     // for(int i=0, j=0, i<5 & j<5, ++)
//     // String str = null;
//     // System.out.println(str.valueOf(10));
//     // String a,b="meal";
//     // a+=b;
//     // System.out.println(a);
//     int i=0;
//     int j=20;
//     int k=31;
//     while(i<j){
//         k+=(i*j);
//         i=i*2;
//         j--;

//     }
//     System.out.println("i="+i+"j=" + j);
//     double z = Math.pow(2.0, 3.0);
//     System.out.println(z);
//     int v1 = 43;
//     int v2 = ~v1;
//     System.out.println(v1+" "+v2);
//     System.out.println(9&8);
//     System.out.println("n="+00);
    
// }
// }


