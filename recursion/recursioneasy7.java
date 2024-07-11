/*Write a program to find the factorial of a number*/

public class recursioneasy7 {

    static int factorial(int num) {

        if (num == 1) {

            return num;
        }

        return factorial(num - 1) * num;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}
