package String;

import java.nio.channels.Pipe.SourceChannel;
import java.util.HashMap;

public class isomorphicString {
    public static void main(String[] args) {
        String s1 = "badc";
        String s2 = "badc";
        isIsomorphic(s1, s2);
    }

    static void isIsomorphic(String s1,String s2)
    {
        boolean result = true;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i < s1.length(); i++)
        {
            if(map.containsKey(s1.charAt(i)))
            {
                if(map.get(s1.charAt(i)) != s2.charAt(i))
                {
                    result = false;
                }
            }else{
                if(map.containsValue(s2.charAt(i)))
                {
                    result =  false;
                }else{
                    map.put(s1.charAt(i), s2.charAt(i));
                }
                
            }
           
        }

    
    System.out.println(result);
}
}
