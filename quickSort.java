public class quickSort {

    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void sort(int arr[], int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    public int partition(int arr[], int low, int high){
        int i = low, j = low, pivot = arr[high];
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public static void main(String[] args){
        quickSort q = new quickSort();
        int arr[] = new int[]{5, 2, 0, 1, 6, 3};
        q.print(arr);
        q.sort(arr, 0, arr.length - 1);
        q.print(arr);
    }
}
