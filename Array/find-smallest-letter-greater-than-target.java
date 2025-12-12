package Day6;
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class leetcode1 {
    
    public static void main(String[] args){
        char[] letters = {'x','x','y','y'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
    //ceiling  = smallest element in array  >= target;
   public static  char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        if(target >= letters[end]){ return letters[0]; }
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(letters[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
