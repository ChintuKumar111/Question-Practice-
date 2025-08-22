package Experiment;

import java.util.ArrayList;
import java.util.List;

public class ValueContains {
    public static void main(String[] args) {

        String s [] = {"levi ,ackerman","mikasa"};

        List<String> list = new ArrayList<>();

        for(int i =0 ; i<s.length;i++){

            if(s[i].contains("e")){

                System.out.println(i+"  "+s[i]);
            }
        }
    }
}
