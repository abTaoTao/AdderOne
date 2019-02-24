package source;

import java.util.Scanner;

import java.math.BigInteger;

public class AdderTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String num = "[+,-]{0,1}\\d+";
        String reg = num + "\\s+" + num;
        if (str.matches(reg) == true) {
            BigInteger result = BigInteger.ZERO;
            char[] s = str.toCharArray();
            for (int i = 0; i < s.length; ++i) {
                if (!Character.isSpaceChar(s[i])) {
                    StringBuilder a = new StringBuilder();
                    int j;
                    for (j = i; j < s.length
                            && !Character.isSpaceChar(s[j]); ++j) {
                        a = a.append(s[j]);
                    }
                    i = --j;
                    result = result.add(new BigInteger(a.toString()));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println("WRONG FORMAT!");
        }
    }
}
