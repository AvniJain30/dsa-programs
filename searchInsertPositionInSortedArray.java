public class searchInsertPositionInSortedArray {
    public static int search(int arr[], int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int arr[] = {2, 5, 7, 9, 23, 56};
        System.out.println(search(arr, 58));
    }
}
