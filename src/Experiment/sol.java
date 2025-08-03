package Experiment;

public class sol {

    int SumDigit(int range){
        int sum = 0;
        int count = 0;

        int [] arr  = new int[range];

        for(int i = 1;i<=range;i++){

           arr[count++] = i;
        }

        for(int each :arr){

            if(each%3==0||each%5==0||each%7==0){

                sum = sum+each;
            }
        }



return sum;
    }

    public static void main(String[] args) {
        sol ss = new sol();;
        int res  = ss.SumDigit(10);
        System.out.println(res);
    }
}
