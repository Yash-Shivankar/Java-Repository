import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n, status, num = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want:");
        n = sc.nextInt();

        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are:");
            System.out.println(2); // The first prime number
        }

        for (int count = 2; count <= n; ) {
            status = 1; // Reset status for the current number
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                count++;
            }
            num++; // Increment the number to check the next possible prime
        }
    }
}
