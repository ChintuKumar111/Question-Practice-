package Experiment;

public class ll {
    public static void main(String[] args) {


        String str [] = {"this is me","here is levi ackerman","mount everest"};



        int max = 0;;
        for (String ans : str){

            int count = 0;

            String xx[] = ans.split(" ");
              count = xx.length;

              max = Math.max(count,max);

        }

        System.out.println("dscsadcsad  "+max);


        }




    }





