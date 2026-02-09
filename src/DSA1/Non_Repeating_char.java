package DSA1;
import java.util.Scanner;

public class Non_Repeating_char {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c]++;
        }
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(freq[c]==1){
                System.out.println(c);
                return;
            }
        }
    }
}
