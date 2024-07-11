/*Write a program to print the sum of n natural numbers*/

public class recursioneasy3 {

    static int numberSum(int num) {

        if (num == 1) {

            return num;
        }

        return numberSum(num - 1) + num;
    }

    public static void main(String[] args) {

        System.out.println(numberSum(10));
    }
}
