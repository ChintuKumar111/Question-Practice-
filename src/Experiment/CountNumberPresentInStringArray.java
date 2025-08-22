package Experiment;

public class CountNumberPresentInStringArray {
    public static void main(String[] args) {

// number of count in present in array
        int s [] = {1,2,3,4,5,6,1,2,3,4,5,2,3,43,2,2,2,3,3,1,1,2,3,5,6,7};

        for(int i = 0 ;i <50;i++){
            int count = 0;
            for(int j = 0 ; j< s.length;j++){

                if(i == s[j]){
                    count++;

                }
            }
            System.out.println(i +" = "+count);
        }
    }
}


