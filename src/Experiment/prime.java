package Experiment;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for(int i = 2; i<=a;i++){
            boolean isPrime = true;

            for(int j = 2; j<=Math.sqrt(i);j++){

                if(i%j==0){
                   isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" " );
            }
        }
    }
}
