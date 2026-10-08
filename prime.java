public class prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor <= number / divisor; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
