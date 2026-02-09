package DSA1;
import java.util.*;

public class TwoStringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int[] freq=new int[256];
        if(str1.length()!=str2.length()){
            System.out.println("The Two Stings are not Anagarm");
            return;
        }
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for(int i=0;i<str1.length();i++) {
            if (freq[i]!=0){
                System.out.println("The Two Strings are not Anagram.");
                return ;
            }
        }
        System.out.println("The Two Strings are Anagram.");
    }
}
