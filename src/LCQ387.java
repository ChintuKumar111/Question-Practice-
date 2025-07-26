public class LCQ387 {

        public int firstUniqChar(String s) {

            for(int i = 0;i<s.length();i++){

                boolean unique = true;

                for(int j = 0 ;j<s.length();j++){

                    if(i!=j && s.charAt(i)==s.charAt(j)){
                        unique = false;
                        break;
                    }
                }
                if(unique)
                    return i;
            }
            return -1;
        }

        public static void main(String []args){

           LCQ387 l1 = new LCQ387();
            System.out.println(l1.firstUniqChar("loveleetcode"));

        }
    }

