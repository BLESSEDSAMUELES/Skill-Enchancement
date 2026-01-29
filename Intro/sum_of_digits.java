package Intro;

import java.util.*;

public class sum_of_digits {

    public static void main(String[] args) {
        int n, d, s = 0, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = sc.nextInt();
        t = n;
        while (n != 0) {
            d = n % 10;
            s += d;
            n /= 10;
        }
        System.out.print("Sum of the digits of " + t + " is " + s);
        sc.close();
    }
}