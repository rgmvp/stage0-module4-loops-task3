package school.mjc.stage0.loops.task3;

import java.math.BigInteger;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int a = first;
        int b = second;
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        System.out.println(gcd.intValue());
    }
}
