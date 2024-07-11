/*Write a program to count occurrence of a specific digit in a given number*/

public class recursioneasy8 {

    int count = 0;

    void findOccurance(int num, int temp) {

        if (num / 10 == 0) {

            return;
        }
        if (num % 10 == temp) {

            count++;
        }

        findOccurance(num / 10, temp);

    }

    public static void main(String[] args) {

        recursioneasy8 obj = new recursioneasy8();
        obj.findOccurance(12569645, 1);
        System.out.println(obj.count);
    }
}
