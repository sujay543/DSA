package Day11;
public class findpivot {
    public static void main(String[] args) {
        // int[] arr = {3,4,5,6,7,0,1,2};
        int[] arr = {5,1,3};
        System.out.println("result : "+arr[pivot(arr)]);
    }

    static int pivot(int[] arr){
        int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // pivot found
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // left side sorted → pivot on right
        if (arr[start] <= arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
    }
}

