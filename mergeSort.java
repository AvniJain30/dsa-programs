public class mergeSort {
    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void sort(int arr[], int temp[], int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for(int i = low; i <= high; i++){
            temp[i] = arr[i];
        }
        int i = low, j = mid + 1, k = low;
        while(i <= mid && j <= high){
            if(temp[i] < temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args){
        int arr[] = new int[]{9, 5, 2, 4, 3};
        mergeSort m = new mergeSort();
        m.print(arr);
        m.sort(arr, new int[arr.length], 0,arr.length - 1);
        m.print(arr);
    }
}
