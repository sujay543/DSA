package String;

public class checkPalindrom {
    public static void main(String[] args) {
        int num = 231;
        String s = String.valueOf(num);
        int start = 0;
        int end = s.length()-1;
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
        }
    }
}
