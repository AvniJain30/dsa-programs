public class bubbleSort {
    public static void sort(int arr[]){
        int n = arr.length;
        boolean isSwapped;
        for(int i = 0; i < n - 1; i++){
            isSwapped = false;
            for(int j = 0; j < n- 1- i; j++){
                if(arr[j] > arr[j +1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                break;
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {3, 56, 43, 2, 13};
        print(arr);
        sort(arr);
        print(arr);
    }
}
