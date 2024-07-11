/*Write a program to print the string in reverse order*/

public class recursioneasy9 {

    int count = 0;

    void reverseString(String str, int index) {

        if (index < str.length()) {

            reverseString(str, index + 1);
            System.out.println(str.charAt(index));
        }
    }

    public static void main(String[] args) {

        recursioneasy9 obj = new recursioneasy9();
        obj.reverseString("Subodh", 0);
        System.out.println();
    }

}
