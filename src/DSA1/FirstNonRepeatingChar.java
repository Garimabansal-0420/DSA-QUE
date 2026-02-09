package DSA1;
import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int [] freq=new int[256];

        // counting freq of the char
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

        boolean found=false;

        // checking which first character is non repeating.
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.println("first non repeating character is:" + str.charAt(i));
                found=true;
                break;
            }
        }

        // if there is no non-repeating character then print the statement
        if(!found){
            System.out.println("no non-repeating character found .");
        }

    }
}
