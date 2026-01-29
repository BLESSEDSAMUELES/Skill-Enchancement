package Intro;

import java.util.Scanner;

public class square_number {
    public static void main(String[] args) {
        int n, fc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                fc += 1;
            }
        }
        if (fc == 3) {
            System.out.print("The number is square");
        } else {
            System.out.print("The number is not square");
        }
    }
}
