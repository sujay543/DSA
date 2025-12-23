package Day8;

public class upperbound {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,5,6,8};
        System.out.println(calluperbound(arr, 5));
    }
     static int calluperbound(int[] arr, int element){
        int  start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            // if(arr[mid] == element){
            //     return mid;
            // }
            // arr = [1,2,3,4,5]; mid = 3 , element = 4
            if(arr[mid] > element ){
                ans = mid;
                end = mid - 1;
            }else{
               start = mid + 1;
            }
            
             
        }
        return ans;
    }
}
