import java.util.Scanner;

public class iLoveBigNumbers {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= input1; i++) {
            factorial *= i;
        }
//        int sumDigits = 0;
//        for (int i = 0; i < factorial)
        System.out.println(factorial);
    }
}