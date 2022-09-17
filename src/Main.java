public class Main {
    public static void main(String[] args) {
        int number = 29;

//        System.out.println(isNumberPrime(number) ? (number + " sayısı asal sayıdır.") : (number + " sayısı asal sayı değildir.."));
        System.out.println(number + (isNumberPrime(number) ? " sayısı asal sayıdır." : " sayısı asal sayı değildir.."));

    }

    public static boolean isNumberPrime(int number) {

        boolean isPrime = true;
        if (number != 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }

        return isPrime;

    }
}
