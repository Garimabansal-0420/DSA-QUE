package DSA1;
import java.util.*;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //String strcopy=str;

        for(int i=0 ,j=str.length()-1; i<j ; i++ , j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("String is not Palindrome.");
                return;
            }
        }
        System.out.println("String is Palindrome.");
    }
}
