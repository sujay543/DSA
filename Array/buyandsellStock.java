package Array;

public class buyandsellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }

    static void maxProfit(int[] arr)
    {
        int min = arr[0];
        int max = 0;
        for(int i = 1;i < arr.length;i++)
        {
           int profit = arr[i] - min;
           max = Math.max(max, profit);
           min = Math.min(arr[i], min);
        }
        System.out.println(max);
    }
}
