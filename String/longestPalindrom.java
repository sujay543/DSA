package String;

public class longestPalindrom {
    public static void main(String[] args) {
        String s = "abaxyzzyxf";
        String s2 = "maam";
        // findPalindrom(s);
        // System.out.println(isPalindrom(s2, 0, 3));
        findlargestPalindrom(s);
    }
    
    static void findlargestPalindrom(String s)
    {
        int maxlength = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i < s.length()-1;i++)
        {
            for(int j = i+1;j < s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    if(isPalindrom(s, i,j)){
                    if(maxlength < (j-i))
                    {
                        maxlength = (j-i);
                        start = i;
                        end = j;
                    }
                    }
                }
                // System.out.println(s.charAt(i)+" "+s.charAt(j));
                
            }

           
        }
        // StringBuilder newS = new StringBuilder();
        // while (start <= end) {
        //     newS.append(s.charAt(start));
        //     start++;
        // }
        System.out.println(s.substring(start, end+1));
        
    }

    static boolean isPalindrom(String s,int start,int end)
    {
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
