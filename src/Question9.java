public class Question9 {

        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

            int count = 0;
            for(int each : hours){

                if(each>=target){
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {

            int hour [] = {0,1,2,3,4,5};
            int target = 2;
        Question9 question9 = new Question9();
        int res =  question9.numberOfEmployeesWhoMetTarget(hour,target);
        System.out.println(res);
    }
    }

