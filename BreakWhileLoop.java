import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Input an integer:");
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println("You entered "+n);
        }
        System.out.println("Exit");
    }
}
