package Array;

import java.util.Scanner;

public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i + 1] += nums[i];

        }

        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            if (i != 4)
                System.out.print(nums[i] + ",");
            else
                System.out.print(nums[i]);
        }
        System.out.print("]");

    }
}
