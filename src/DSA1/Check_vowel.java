package DSA1;
import java.util.Scanner;

public class Check_vowel {
public static void main() {
    Scanner input=new Scanner(System.in);
    String str1= input.nextLine().toLowerCase();
    int vowel=0;
    for(int i=0;i<str1.length();i++){
        char c =str1.charAt(i);
        if("aeiouAEIOU".indexOf(c)!=-1){
            vowel++;
        }
    }
    System.out.println(vowel);
}
}
