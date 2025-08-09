package Experiment;

public class twoDArrayAddition {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // addition by  1+2+3 = 6 like ...


        for(int row = 0 ; row< arr.length;row++){

            int rowColSum =0 ;

            for(int col = 0 ; col<arr[row].length;col++){

                rowColSum += arr[row][col]; // arr[0][0]  = 1 then arr[0][1] = 2 then arr[0][2]= 3  , sum = 1+2+3 = 6;

            }
            System.out.println("rowColSum = " +rowColSum );
        }


        // 1+4+7 = 12 like


        for(int col = 0 ;col<arr[0].length;col++){
            int colRowSum = 0;
            for(int row = 0 ;row< arr.length;row++){

                colRowSum += arr[row][col];     // arr[0][0]  = 1 then arr[1][0] = 4 then arr[2][0]= 7  , sum = 1+4+7 = 12
            }
            System.out.println("colRowSum = " +colRowSum );
        }





    }
}
