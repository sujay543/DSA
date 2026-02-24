package String;

public class rotateString{
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotate(s,goal));
    }

    static boolean rotate(String s, String goal) {
         if(s.length() != goal.length())
         {
            return false;
         }

         String doubled = s+s;
         return doubled.contains(goal);
    }
}
