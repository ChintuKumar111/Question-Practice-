public class Question19 {

        public int maximumWealth(int[][] accounts) {

            int res = 0 ;

            for(int i = 0; i<accounts.length;i++){
                int sum = 0;
                for(int j = 0 ;j<accounts[i].length;j++){

                    sum +=accounts[i][j];
                }
                res = Math.max(sum , res);
            }
            return res;


    }

    public static void main(String[] args) {


    }
}
