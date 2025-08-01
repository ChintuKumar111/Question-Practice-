package Experiment;

 class Solution {
  int nn(int number ){
        int count = 0;

        int value = number;



        while(number>0){

            int newInput = number%10;

            if(value%newInput==0){
                count++;
            }

            number /=10;
        }

return  count;

    }

     public static void main(String[] args) {

        Solution  s = new Solution();


         int res = s.nn(1210);
         System.out.println(res);


     }
}
