package Recursion;

import java.util.Scanner;

public class Sum_Natural_num {
    public static int Sum_Num(int n){
        if(n==0)
            return 0;
        // we can do this
        /*n+=Sum_Num(n-1);
        return n;*/

        // so this
        return n + Sum_Num(n-1);
    }
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Sum_Num(n));
    }
}
