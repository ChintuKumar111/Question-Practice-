public class Questio25 {
    class Solution {
        public boolean canAliceWin(int[] nums) {

            int aliceSingle = 0;
            int bobSingle = 0;

            int aliceDouble = 0;
            int bobDouble = 0;


            for(int each : nums ){

                if(each <10){

                    aliceSingle += each;
                    bobDouble +=each;
                }else{

                    aliceDouble +=each;
                    bobSingle+=each;
                }
            }

            return aliceSingle>bobSingle || aliceDouble>bobDouble;
        }
    }
}
