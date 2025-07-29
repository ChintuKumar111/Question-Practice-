public class LCQ1832 {




    public static void main(String[] args) {


        int count = 0;

        LCQ1832 l = new LCQ1832();
        String s= "quick brown fox jumps over the lazy dog";

        System.out.println(l.have(s));


    }

     public boolean have(String s) {

        String str = s;

        int count = 0;


        for (char i = 'a'; i <= 'z'; i++) {

            for (int j = 0; j < str.length(); j++) {

                if (i == str.charAt(j)) {

                    count++;
                    break;
                }


            }
        }
        if(count==26){
            return true;
        }

        return false;
    }
}
