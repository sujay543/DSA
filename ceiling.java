package Day5;

public class ceiling {
    public static void main(String[] args){
        int[] arr = {1,2,3,6,8};  // target = 8;
        System.out.println(find(arr, 9));
    }
    //ceiling  = smallest element in array  >= target;
    static int find(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;
        if(target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return start;
    }
}
