/*Write a program to check whether the number is prime or not*/

public class recursioneasy5 {

    static boolean isPrime(int num, int temp) {

        if (num <= 2) {
            return (num == 2) ? true : false;
        }
        if (num % temp == 0) {
            return false;
        }
        if (temp * temp > num) {
            return true;
        }
        return isPrime(num, temp + 1);
    }

    public static void main(String[] args) {

        System.out.println(isPrime(97, 2));
    }
}
