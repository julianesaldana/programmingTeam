import java.util.Scanner;

public class smith_numbers {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        System.out.println("How many test cases?");
        int [] numbers;
        int testNum = in.nextInt();
        for (int i = 0; i < testNum; i++){
            System.out.println("Enter test case");
            int user_num = in.nextInt();
            if (user_num % 2 != 0){
                if (user_num % 3 != 0){
                    System.out.println("uhhhhh");
                }
            }
        }
    }
}
