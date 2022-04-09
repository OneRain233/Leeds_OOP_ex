import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static long[] tmp = new long[100007];
    static long d = 1000000007;
    public static void initialize(){
        
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = f(i);
        }
        // System.out.println("down");
    }
    public static void main(String[] args) {
        initialize();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        long gn = 0;
        //定义 g(n) = ∑ni=1 f(i) 。
        for(int i = 1; i <= x; i++) {
            gn = gn + tmp[i];
        }
        System.out.println(gn % d);

        sc.close();
    }
    public static long f(int x){
 

        long fx = 0;
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                fx = fx + i * i;
            }
        }
        
        return fx;

    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // 蜂巢 求两点距离
//         int d1,d2,p1,p2,q1,q2; // 两个蜂巢的坐标
//         d1 = sc.nextInt();
//         p1 = sc.nextInt();
//         q1 = sc.nextInt();
//         d2 = sc.nextInt();
//         p2 = sc.nextInt();
//         q2 = sc.nextInt();

//         // 计算需要的步数

//     }

// }


// public class Main {
//     public static void main(String[] args) {
//         //全排列的价值
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         // 1-n 的全排列
//         List<String> list = new ArrayList<>();
//         for (int i = 1; i <= n; i++) {
//             list.add(String.valueOf(i));
//         }
//         // 全排列
//         List<String> result = new ArrayList<>();
//         permutation(list, result, "");
//         // 全排列的价值
//         int res = 0;
        
//         for(String s : result){
//             int sum = 0;
//             for(int i = 0; i < s.length(); i++){
//                 for(int j = 0; j < i; j++){
//                     if(s.charAt(i) > s.charAt(j)){
//                         sum++;
//                     }
//                 }
//             }
//             res += sum;
//         }
//         System.out.println(res);

        
//     }

//     private static void permutation(List<String> list, List<String> result, String string) {
//         if (list.size() == 0) {
//             result.add(string);
//             return;
//         }
//         for (int i = 0; i < list.size(); i++) {
//             String s = list.get(i);
//             list.remove(i);
//             permutation(list, result, string + s);
//             list.add(i, s);
//         }
//     }
// }






// public class Main {
//     public static void main(String[] args) {
//         // g = gcd(a + k, b + k) 
//         // find k make g bigger

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int k = 0;
//         int prevGCD = -1;
//         int nowGCD = -1;
//         while(true) {
//             nowGCD = gcd(a + k, b + k);
//             if(nowGCD >= prevGCD) {
//                 prevGCD = nowGCD;
//             } else {
//                 break;
//             }
//             k++;
//         }
//         System.out.println(k-1);
//         sc.close();
//     }
//     public static int gcd(int x, int y) {
//         if(x == 0) return y;
//         return gcd(y % x, x);
//     }
// }


//2
// public class Main {
//     public static void main(String[] args) {
//         // s = a1a2 + a1a3 + a1a4 + ... + a1an + a2a3 + ......

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         List<Integer> arr = new ArrayList<>();
//         for(int i = 0; i < n; i++) {
//             arr.add(sc.nextInt());
//         }
//         Long sum = (long) 0;
//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 sum += arr.get(i) * arr.get(j);
//             }
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }
