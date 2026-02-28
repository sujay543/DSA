package String;

public class largestOdd {
    public static void main(String[] args) {
        String s = "4206";
        // System.out.println(largestOddNumber(s));
        largestOddNumber(s);
    }

    static void largestOddNumber(String num) {
        int max = 0;
        for(int i = num.length() - 1;i >= 0;i--)
        {
           
            if( Integer.parseInt(num.substring(0, i+1))%2 != 0){
                max = Math.max(max, Integer.parseInt(num.substring(0, i+1)));
            }
        }
        if(max == 0)
        {
            System.out.println(" ");
            return;
        }
        System.out.println(String.valueOf(max));
    }
}
