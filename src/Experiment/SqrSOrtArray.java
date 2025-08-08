package Experiment;

import java.util.Arrays;

public class SqrSOrtArray {

    public static void main(String[] args) {

        int num [] = {-3,2,4,-5,6};
        int temp [] = new int[num.length];

        for(int i = 0; i<num.length;i++){

            temp[i ] = num[i] *num[i];
        }

        Arrays.sort(temp);

        Arrays.toString(temp);



    }
}
