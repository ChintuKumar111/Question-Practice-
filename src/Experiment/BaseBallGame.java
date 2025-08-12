package Experiment;
//
//

import org.w3c.dom.ls.LSOutput;

import java.util.*;



//Output: 30
//Explanation:
//        "5" - Add 5 to the record, record is now [5].
//        "2" - Add 2 to the record, record is now [5, 2].
//        "C" - Invalidate and remove the previous score, record is now [5].
//        "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//        "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//The total sum is 5 + 10 + 15 = 30.

//String[] ops = {"5", "2", "C", "D", "+"};
public class BaseBallGame {

    public int calPoints(String[] operations) {

        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            try {
                if (operations[i].equals("D")) {
                    int previousRecord = list.get(list.size() - 1);
                    list.add(previousRecord * 2);
                }
                else if (operations[i].equals("C")) {
                    list.remove(list.size() - 1);
                }
                else if (operations[i].equals("+")) {
                    int farPrevious = list.get(list.size() - 2);
                    int actualPrevious = list.get(list.size() - 1);
                    list.add(farPrevious + actualPrevious);
                }
                else {
                    list.add(Integer.parseInt(operations[i]));
                }
            } catch (Exception e) {
                System.out.println("Invalid number in previous operation.");
            }
        }

        for (int each : list) {
            sum += each;
        }

        return sum;
    }

    public static void main(String[] args) {


        BaseBallGame baseBallGame = new BaseBallGame();

        String[] ops ={"1","C"};

        int result = baseBallGame.calPoints(ops);
        System.out.println("output is : "+result);

    }
}