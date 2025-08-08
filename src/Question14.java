import java.util.Arrays;

public class Question14 {

        public int[] sortedSquares(int[] nums) {

            int temp [] = new int[nums.length];

            for(int i = 0; i< nums.length;i++){

                temp[i] = nums[i] *nums[i];
            }

            Arrays.sort(temp);

            return  temp;




    }

    public static void main(String[] args) {

            int n [] = {-1,-3,4,5};

            Question14 question14 = new Question14();
            question14.sortedSquares(n);


    }
}
