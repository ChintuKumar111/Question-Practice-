package Experiment;

public class Question10 {

        public int differenceOfSum(int[] nums) {
            int sum = 0;
            int dSum= 0;
            int result = 0;


            for(int i = 0; i<nums.length;i++){

                sum = sum+nums[i];

                while(nums[i]>0){

                    dSum = dSum+ nums[i]%10;

                    nums[i] /=10;
                }

            }


            return(sum-dSum);
        }

    public static void main(String[] args) {
        int  [] x = {1,15,2,3};

        Question10 question10 = new Question10();
       int res =   question10.differenceOfSum(x);
        System.out.println(res);
    }
    }

