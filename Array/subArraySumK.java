package Array;
public class subArraySumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subArraySum(arr, 3);
    }

    static void subArraySum(int[] arr, int k){
        int sum = 0;
        int start = 0;
        int end = 0;
        int n = arr.length -1;
        int count = 0;
        while(end <= n && start <= n)
        {
            sum += arr[end];
            System.out.println(sum);
            while(sum > k)
            {
                sum = sum - arr[start];
                start++;
            }

            if(sum < k)
            {
                end++;
            }else{
                count++;
                end++;
            }
        }
        System.out.println(count);
    }
}
