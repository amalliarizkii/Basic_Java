package BasicProgamming;

public class Problem4 {
    private static boolean primeNumber(int input){
        int n = input;
        if (n <= 1) {
            return false;
        }

        double x = Math.sqrt(n);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    private static boolean primeNumber2 (int input){
        int n = input;
        if (n <= 1) {
            return false;
        }

        //double x = Math.sqrt(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println(primeNumber2(11));
        System.out.println(primeNumber2(13));
        System.out.println(primeNumber2(17));
        System.out.println(primeNumber2(20));
    }
}
