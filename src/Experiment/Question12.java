package Experiment;

public class Question12 {


        public int xorOperation(int n, int start) {

            int res = 0;

            for(int i = 0;i<n;i++){

                int temp = start+(2*i);
                res^=temp;
            }
            return res;
        }

    public static void main(String[] args) {
        Question12 question12 = new Question12();
        System.out.println(question12.xorOperation(5,0));
    }

}
