class LCQ1 {
    public int addDigits(int num) {
        int x=0;
        while(num>9){
            int sum = 0;
            while(num>0){

                int input = num%10;
                sum +=input;
                num /=10;
            }
            num = sum;
        }




        return num;
    }



    public static void main(String args[]){

        LCQ1 s1 = new LCQ1();
        System.out.println(s1.addDigits(38));

    }
}