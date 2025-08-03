public class Question11 {

        public int sumOfMultiples(int n) {

            int sum = 0;


            for( int i=1;i<=n;i++){

                if(i%3==0||i%5==0||i%7==0){
                    sum = sum+i;
                }

            }


            return sum;
        }

    public static void main(String[] args) {
        Question11 question11 = new Question11();
        int res =  question11.sumOfMultiples(7);
        System.out.println(res);
    }
    }

