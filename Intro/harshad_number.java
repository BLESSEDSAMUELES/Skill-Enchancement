package Intro;

import java.util.*;

public class harshad_number {
    public static void main(String[] args) {
        int n, d, s = 0, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = sc.nextInt();
        sc.close();
        t = n;
        while (n != 0) {
            d = n % 10;
            s += d;
            n /= 10;
        }
        if (t % s == 0)
            System.out.print("The number is Harshad number");
        else
            System.out.print("The number is not Harshad number");

    }
}
