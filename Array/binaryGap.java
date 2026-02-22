package Array;

public class binaryGap {
    public static void main(String[] args) {
        int num = 5;
        checkGap(num);
    }

     static void checkGap(int num) {
        String binaryString = Integer.toBinaryString(num);

        int count =0;
        int maxCount = 0;
        int start = 0;
        int end = 0;
        while(end < binaryString.length())
        {
            if(binaryString.charAt(end) == '1')
            {
                count = end - start;
                start = end;
                maxCount = Math.max(maxCount, count);
            }

            end++;
        }
        System.out.println(maxCount);
        
    }
}
