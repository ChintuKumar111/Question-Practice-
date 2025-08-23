package Dsa;

public class ReverseInteger {

        public int reverse(int x) {
            long result = 0L;

            while(x!=0){
                int n = x%10;
                result  =result*10+n;
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    return 0;
                }

                x = x/10;


            }


            return  (int) result;
        }
    }

