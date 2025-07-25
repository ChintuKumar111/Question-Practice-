public class LCQ387 {
    public static void main(String[] args) {

        String str = "aabb";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            boolean bn = true;
            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {

                    bn = false;
                    break;


                }
            }

            if (bn) {
                System.out.println(i + "index");
                found = true;
                break;

            }

        }
        if(!found)System.out.println("-1");



    }

}