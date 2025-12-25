package Day10;

public class findMountainArray {
    public static void main(String args[]){
        int[] arr={1,5,2};
        System.out.println(foundindex(arr, 2));
    }

    public static int foundindex(int[] mountainArr,int target){
         int max = peakIndexInMountainArray(mountainArr);

         if(mountainArr[max] == target){
            return max;
         }

         int start = 0;
         int end = max - 1;
         while(start <= end){
            int mid = start + (end - start) / 2;
            if(mountainArr[mid]==target){
                return mid;
            }
            if(mountainArr[mid]< target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
         }

         start = max+1;
         end= mountainArr.length - 1;
         while(start <= end){
            int mid = start + (end - start) / 2;
            if(mountainArr[mid]==target){
                return mid;
            }
            if(mountainArr[mid]> target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
         }

         return -1;
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    
   }
}


