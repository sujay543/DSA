package String;

public class checkequalString {
     static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstString = "";
        for(int i = 0;i<word1.length;i++)
        {
            firstString += word1[i];
        }
      String SecondString = "";
        for(String i : word2)
        {
           SecondString += i ;
        }
        return firstString.equals(SecondString);
    }
    public static void main(String[] args) {
        String[] s1 = {"he" ,"llo"};
        String[] s2 = {"he" ,"llo"};
        System.out.println(arrayStringsAreEqual(s1, s2));
    }
}
