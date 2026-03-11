package String;

public class findNuberofSubstring {
    public static void main(String[] args) {
        String s = "abcabc";  
        substring(s);
    }

    static void substring(String s)
    {
        // String baseString = ''
        if(!s.contains("a") && !s.contains("b") && !s.contains("c"))
        {
            System.out.println("0");
            return;
        }
        int count = 0;
        for(int i = 0;i < s.length();i++)
        {
            // String sub = s.substring(, i+3)
            // if(s.contains("a") && s.contains("b") && s.contains("c"))
            // {
            // if(s.substring(0,i+3).contains("a"))
            for(int j = i+3;j < s.length()+1;j++)
            {
                String subString = s.substring(i, j);
                if(subString.contains("a") && subString.contains("b") && subString.contains("c"))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
