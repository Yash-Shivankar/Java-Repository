import java.util.Scanner;

public class SubStringsOfString {
    public static void main(String[] args) {
        String string;
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print all its substrings:");
        string = sc.nextLine();
        length = string.length();

        System.out.println("Substrings of \"" + string + "\" are:");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String sub = string.substring(i, j);
                System.out.println(sub);
            }
        }
    }
}
