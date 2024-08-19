
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        //Using 3rd Variable
        // int x, y, temp;
        // System.out.println("Enter x and y :");
        // Scanner sc = new Scanner(System.in);
        // x = sc.nextInt();
        // y = sc.nextInt();

        // System.out.println("Before Swapping\n x ="+x+"\n y ="+y);

        // temp = x;
        // x = y;
        // y = temp;

        // System.out.println("After Swapping\n x ="+x+"\n y ="+y);

        //Without Using 3rd Variable
        int x, y;
        System.out.println("Enter x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping\n x ="+x+"\n y ="+y);

        // x = x ^ y;
        // y = x ^ y;
        // x = x ^ y;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping\n x ="+x+"\n y ="+y);

    }
    
}