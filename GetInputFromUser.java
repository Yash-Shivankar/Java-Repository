import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String :");
        s = in.nextLine();
        System.out.println("You entered String :"+s);

        System.out.println("Enter a Integer :");
        a = in.nextInt();
        System.out.println("You entered Integer :"+a);

        System.out.println("Enter a Float :");
        b = in.nextFloat();
        System.out.println("You entered Float :"+b);
        
    }
    
}
