package Experiment;

import java.util.Arrays;

public class ExperimentForBestTime {

    public static void main(String[] args) {
        int[] nums = {-4, -2, -4, 3, 5};
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1, pos = right;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[pos--] = leftSquare;
                left++;
            } else {
                result[pos--] = rightSquare;
                right--;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
