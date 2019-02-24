package source;

import java.util.Scanner;

import java.math.BigInteger;

public class AdderFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = str.replaceAll("\\s*", "");
        if (Character.isDigit(str2.charAt(0))) {
            str2 = "+" + str2;
        }
        //delete the second symbol
        char[] s = str2.toCharArray();
        char[] s1 = new char[100007];
        for (int i = 0, j = 0; i < s.length; ++i) {
            if (s[i] == '+' && s[i + 1] == '+'
                    || s[i] == '-' && s[i + 1] == '-') {
                s1[j++] = '+';
                i++;
            } else if (s[i] == '+' && s[i + 1] == '-'
                    || s[i] == '-' && s[i + 1] == '+') {
                s1[j++] = '-';
                i++;
            } else {
                s1[j++] = s[i];
            }
        }
        //char s1 to calculation
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < s1.length; ++i) {
            StringBuilder num = new StringBuilder();
            if (Character.isDigit(s1[i])) {
                int j = 0;
                for (j = i; Character.isDigit(s1[j]); ++j) {
                    num = num.append(s1[j]);
                }
                if (s1[i - 1] == '+') {
                    sum = sum.add(new BigInteger(num.toString()));
                } else {
                    sum = sum.subtract(new BigInteger(num.toString()));
                }
                i = --j;
            }
        }
        System.out.println(sum.toString());
    }
}


