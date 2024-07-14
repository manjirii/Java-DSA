/*Write a program to print the sum of odd numbers up to a given number*/

public class recursionpractice4 {

    int sum = 0;

    void sumOfOddNum(int num) {

        if (num == 0) {

            return;
        }
        if (num % 2 != 0) {

            sum = sum + num;
        }
        sumOfOddNum(num - 1);
    }

    public static void main(String[] args) {

        recursionpractice4 obj = new recursionpractice4();

        obj.sumOfOddNum(50);

        System.out.println(obj.sum);
    }
}
