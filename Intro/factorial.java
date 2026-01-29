package Intro;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            fact *= n;
            n -= 1;
        }
        System.out.print("The factorial is " + fact);
    }
}
