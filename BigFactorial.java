
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        int n, i;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Integer:");
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n +"! = "+ fact);
    }
}
