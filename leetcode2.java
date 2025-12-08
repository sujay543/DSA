public class leetcode2 {
    //richestperson
    public static void main(String[] args){
        int[][] accounts = {{1,2,3}, {3,4,4}};
        System.out.println(maximumWealth(accounts));
    }

    // static void sumelement(int i, int j )
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0;i< accounts.length;i++){
            int sum = 0;
            for(int j = 0; j< accounts[i].length; j++){
                sum += accounts[i][j];
            }
           if(max < sum){
            max = sum;
           }
        }
        return max;
    }
}
