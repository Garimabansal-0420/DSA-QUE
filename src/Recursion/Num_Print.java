package DSA1;

public class Num_Print {
    public static void print(int n) {
        //base condition / return statement
        if(n==0)
            return;

        // printing statement / storage
        System.out.println(n + " ");    // output --> 5 4 3 2 1

        // recurrence relation
        print(n-1);

        //System.out.println(n + " ");      // output --> 1 2 3 4 5

    }
    public static void main() {
        // calling function
        print(5);
    }
}
