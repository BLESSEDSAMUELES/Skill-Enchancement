package Array;

import java.util.*;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            System.out.println("Equilateral");
        } else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }

}
