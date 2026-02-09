/*package DSA1;
import java.util.Scanner;

public class StringUniformTime {
    public static int isvowel() {

    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<testcase;i++){
            String str=sc.nextLine();
            int[] freq=new int[26];
            int vowel=0;
            int consonent=0;
            for(char ch : str.toCharArray()){
                freq[ch-'A']++;
                if(isvowel(ch))
            }
        }

    }
}

import java.util.Scanner;
public class StringUniformTime {
    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < testCase; i++) {
            String str = sc.nextLine();
            int[] freq = new int[26];
            int vowel = 0;
            int consonant = 0;
            for (char ch : str.toCharArray()) {
                freq[ch - 'A']++;
                if (isVowel(ch)) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            int ans = Integer.MAX_VALUE;
            for (char j = 'A'; j <= 'Z'; j++) {
                int count = freq[j - 'A'];
                int cost;
                if (isVowel(j)) {
//converting all char into a particular vowel cost = consonant * 1 + (vowel - count) * 2;
                } else {
                    cost = vowel * 1 + (consonant - count) * 2;
                }
                ans = Math.min(ans, cost);
            }
            System.out.println("Case #" + i + ": " + ans);
        }
        return;
    }
}*/