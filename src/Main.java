import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigInteger money, members;
        Scanner scan = new Scanner(System.in);
        money = scan.nextBigInteger();
        members = scan.nextBigInteger();

        BigInteger result1 = money.divide(members);
        BigInteger result2 = money.remainder(members);
        System.out.println(result1);
        System.out.println(result2);
    }
}