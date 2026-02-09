package DSA1;
import java.util.Scanner;

public class String_Reverse {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}
