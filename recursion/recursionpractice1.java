/*Write a program to print the factorial of a given number*/

public class recursionpractice1 {

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
