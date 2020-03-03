public class summation_of_primes {
    public static void main(String[] arg) {
        long sum = 0;
        for (long i = 0; i < 2000000; i++){
            if (i != 1){
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j != 0)
                        sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
