
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter three Integers :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("First number is larger.");
        }else if(y>x && y>z){
            System.out.println("Second number is larger.");
        }else if(z>x && z>y){
            System.out.println("Third number is larger.");
        }else{
            System.out.println("Entered numbers are not distinct.");
        } 
    }
    
}
