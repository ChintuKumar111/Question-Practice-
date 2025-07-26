
import java.util.*;

public class LCQ2974 {

        public int[] numberGame(int[] nums) {

            Arrays.sort(nums);

            for(int i = 0 ; i<nums.length;i+=2){

                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1]=  temp;
            }
            return nums;
        }

        public static void main(String [] args){
            int [] num = {5,4,2,3};

            LCQ2974 s1 = new LCQ2974();

           int n [ ]  = s1.numberGame(num);

            for(int value :n){

                System.out.print(value);
            }
        }
    }

