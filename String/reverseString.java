package String;

public class reverseString {
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start <= end)
        {
            swap(s,start,end);
            start++;
            end--;
        }
    }

    static void swap(char[] s,int start,int end)
    {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }

    public static void main(String[] args) {
        
    }

}
