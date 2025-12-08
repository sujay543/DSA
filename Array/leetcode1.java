public class leetcode1 {
    
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        // findNumbers(nums);
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
     int count=0;
        for(int i = 0; i < nums.length;i++){
            if(countDig(nums[i])%2 ==0){
                count++;
            }
        }
       return count;
    }
     static int countDig(int num){
        // int count=0;
        // while(num > 0){
        //    num = num / 10;
        //    count++;
        // }
        // return count;

        return (int)(Math.log10(num)+1); // this approach is far more faster 99.33%
    }




}
