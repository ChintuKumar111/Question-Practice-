public class Question22 {
    class Solution {
        public int arraySign(int[] nums) {

            int n = 0;

            for(int each : nums){

                if(each ==0) return 0;
                if(each <0) n++;
            }
            if(n%2==0) return 1;


            return -1;
        }
    }
}
