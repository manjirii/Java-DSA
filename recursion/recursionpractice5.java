/*write a program to check whether the given number is a plaindrome number or not */

public class recursionpractice5 {

    int sum = 0;

    int reverse(int n, int temp) {

        if (n == 0) {
            return temp;
        }

        temp = (temp * 10) + (n % 10);

        return reverse(n / 10, temp);

    }

    public static void main(String[] args) {

        recursionpractice5 obj = new recursionpractice5();

        int num = 12321;

        if (obj.reverse(num, 0) == num) {

            System.out.println(num + " is palindrome");
        } else {

            System.out.println(num + " is not a palindrome");
        }
    }
}
