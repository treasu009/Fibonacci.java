import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        int count = 100;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }
}