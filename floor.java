package Day5;
//
public class floor {
    public static void main(String[] args) {
        char[] arr = {'x','x','y','y'};//7;
        char[] c = {'c','f','j'};
       System.out.println(nextGreatestLetter(arr,'a'));

    }
    //floor = element that is greatest and <= target;
    static int findfloor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target < arr[0]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            

            }
            return end;
        }

        
    //[0,1,2,3,4]
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < letters[start]){ return letters[0]; }
            if(letters[mid]<target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[end];
    }
}
    

    

