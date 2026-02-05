package Array;

import java.util.*;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int nums[] = new int[4];
        System.out.println("Enter the elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int j : nums) {
            int flag = 0;
            while (j > 0) {
                j /= 10;
                flag++;
            }
            if (flag % 2 == 0) {
                count++;
            }
        }
        System.out.println("The number of even digits:" + count);

    }

}
