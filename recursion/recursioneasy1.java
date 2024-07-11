/*Write a program to print the numbers between 1 to 10*/

public class recursioneasy1 {

    static void numPrint(int num) {

        if (num == 0) {

            return;
        }

        numPrint(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {

        numPrint(10);
    }

}
