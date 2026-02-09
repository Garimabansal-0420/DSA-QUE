package DSA1;
import java.util.Scanner;
//sir method
//right
class Check_Anagram {
    public static boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length())
            return false;

        // Step 2: ASCII frequency array
        int[] freq = new int[256];

        // Step 3: Increase count for first string
        for (int i = 0; i < s.length(); i++) {
            freq[(int) s.charAt(i)]++;
        }

        // Step 4: Decrease count for second string
        for (int i = 0; i < t.length(); i++) {
            freq[(int) t.charAt(i)]--;
        }

        // Step 5: Check if all frequencies are zero
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
        public static void main() {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            String s2 = sc.next();
            if(!isAnagram(s1,s2)){
                System.out.println("Not an Anagram");
            }
            else{
                System.out.println("Anagram");
            }
        }
    }


//my method
//Wrong.
    /*public class Check_Anagram {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int c=0;
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
        }
        else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (arr1[i] == arr2[j]) {
                        c++;
                        break;
                    }
                }
            }
            if (c == s1.length()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
    }
}



*/
