package Experiment;

import java.util.*;
//Input: words = ["leet","code"], x = "e"
public class learning2 {
    class Solution {
        public List<Integer> findWordsContaining(String[] words, char x) {

            List<Integer> rs = new ArrayList<>();

            for(int i =0 ;i< words.length;i++){

                if(words[i].contains(String.valueOf(x))){
                    rs.add(i);


                }
            }


             return rs;
        }
    }

}