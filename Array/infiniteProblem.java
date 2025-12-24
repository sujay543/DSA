package Day9;

public class infiniteProblem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(foundelement(arr, 6));
    }
    
    static int foundelement(int[] arr,int element){
        int start = 0;
        int end = start + 1;
        while(element > arr[end]){
            start = end;
            end = end * 2;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == element){
                return mid;
            }else if(arr[mid] < element){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            
        }
        return -1;
    }
}
