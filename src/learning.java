import java.io.RandomAccessFile;
import java.sql.SQLOutput;

public class learning {
    public static void main(String[] args) {

//
//        int count = 0;
//
//learning l = new learning();
//String s= "thequickbrownfxjum";
//
//        System.out.println(l.have(s));
//
//
//    }
//
//    boolean have(String s) {
//
//        String str = s;
//
//        int count = 0;
//
//
//        for (char i = 'a'; i <= 'z'; i++) {
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (i == str.charAt(j)) {
//
//                    count++;
//                    break;
//                }
//
//
//            }
//        }
//        if(count==26){
//            return true;
//        }
//
//return false;


        String str[] = {"This is the Levi Ackerman"};



        // new method
        for (String strr :str){


        }




        int arr[] = new int[0];


        for(String d : str){

            arr = new int[d.length()];
        }

        int x = 0;





        for(String v : str){
            System.out.println(v);
            int count = 0 ;
            int value = 0;
            for(int i = 0; i< v.length(); i++) {


            char c = v.charAt(i);

            if (c != ' ') {
                count++;
                value= count;
                arr[x++] = value;


            }

            if (c == ' ') {
                count=0;

            }



            }

            System.out.println("word length = " + count);
            System.out.println("Final value = " + value);


        }
        int max = arr[0];

        for(int i = 0;i< arr.length;i++){

            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max value is "+max);




    }


}












