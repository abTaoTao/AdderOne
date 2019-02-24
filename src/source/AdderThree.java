package source;

import java.util.Scanner;

import java.math.BigInteger;

public class AdderThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int type;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 2; ++i) {
            type = scan.nextInt();
            String string = scan.next();
            BigInteger a = new BigInteger(string, type);
            sum = sum.add(a);
        }
        type = scan.nextInt();
        scan.close();
        System.out.println(sum.toString(type));
    }
}

