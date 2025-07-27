public class LCQ1832 {




    public static void main(String[] args) {


        int count = 0;

        learning l = new learning();
        String s= "thequickbrownfxjum";

        System.out.println(l.have(s));


    }

    boolean have(String s) {

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
