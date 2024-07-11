/*Write a program to display the first 10 natursl numbers in reverse order */

public class recursioneasy2 {

    static void reverseNum(int num) {

        if (num == 0) {

            return;
        }

        System.out.println(num);
        reverseNum(num - 1);
    }

    public static void main(String[] args) {

        reverseNum(10);
    }
}
