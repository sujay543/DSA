public class secondLargest {
    static int LargestSecond(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int element : nums)
        {
            if(element > largest)
            {
                secondLargest = largest;
                largest = element;
            }

            if(element > secondLargest && element != largest)
            {
                secondLargest = element;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(LargestSecond(nums));
    }
}
