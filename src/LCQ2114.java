class LCQ21 {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (String ans : sentences){

            int count = 0;

            String [] arr = ans.split(" ");

            count = arr.length;
            max = Math.max(count,max);
        }
        return max;
    }

    public static void main(String [] args){


        String [] ans = {"abcd  hghj ghf","to the "};
        LCQ21 s = new LCQ21();

         int value = s.mostWordsFound(ans);

        System.out.println("ans is "+value);
    }
}