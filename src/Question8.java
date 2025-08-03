import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {

        String[] s = {"abc", "car", "ada", "racecar", "cool"};




        ArrayList<String> ar = new ArrayList<>();

        for(String ec : s){
           

            String reverse = new StringBuilder(ec).reverse().toString();

            if (reverse.equals(ec)) {
                System.out.println(ec);
                return;
            }
        }
    }



}
