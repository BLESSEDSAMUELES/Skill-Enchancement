package Array;

import java.util.*;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = new Scanner(System.in).nextInt();
        }
        int product = 1;
        for (int i = 0; i < 5; i++) {
            product *= nums[i];
        }
        if (product > 0) {
            System.out.println("positive");
        } else if (product < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
