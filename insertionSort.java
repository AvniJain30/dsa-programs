public class insertionSort {
    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void sort(int arr[]){
        for(int i = 1; i < arr.length; i++){    //unsorted part of array
            int temp = arr[i];
            int j = i - 1;                      //sorted part of array
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = new int[]{5, 23, 87, 43, 1};
        insertionSort s = new insertionSort();
        s.print(arr);
        s.sort(arr);
        s.print(arr);
    }
}
