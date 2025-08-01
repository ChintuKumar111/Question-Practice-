public class Question7 {

        public int countDigits(int num) {
            int count = 0;
            int value = num;

            while(num>0){

                int newInput = num%10;

                if(newInput!=0 && value%newInput==0){
                    count++;
                }
                num /=10;
            }
            return count;
        }

        public static void main(String args[]){

            Question7 s = new Question7();
            int res = s.countDigits(121);
            System.out.println(res);
        }

}
