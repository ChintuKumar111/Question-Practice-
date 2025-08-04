public class Question13 {

        public int differenceOfSums(int n, int m) {


            int sum = 0;
            int dSum = 0;

            for(int i = 1;i<=n;i++){

                if(i%m==0){
                    dSum+=i;
                }else{

                    sum +=i;
                }


            }
            return sum-dSum;
        }

    public static void main(String[] args) {

            Question13 question13 = new Question13();

            question13.differenceOfSums(10,3);

    }
    }

