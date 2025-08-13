package Experiment;

import java.util.*;
//Input: words = ["leet","code"], x = "e"
public class learning2 {

        public List<Integer> findWordsContaining(String[] words, char x) {

            List<Integer> rs = new ArrayList<>();

            for(int i =0 ;i< words.length;i++){

                if(words[i].contains(String.valueOf(x))){
                    rs.add(i);


                }
            }


             return rs;
        }

    public static void main(String[] args) {
        learning2 l1  = new learning2();
       String [] words = {"leet","abcdfgrt","code"};

        char  x = 'g';
        System.out.println( l1.findWordsContaining(words,x));
    }
    }

