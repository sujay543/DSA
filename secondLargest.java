public class secondLargest {
    static int LargestSecond(int[] nums) {
        int max = findMax(nums);
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++)
        {
            if(secondLargest < nums[i] && nums[i] != max)
            {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    static int findMax(int[] nums)
    {
        int max = Integer.MIN_VALUE;
       for(int i = 0;i < nums.length;i++)
       {
        if(nums[i] > max)
        {
            max = nums[i];
        }
       }
       return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(LargestSecond(nums));
    }
}
