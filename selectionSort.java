public class selectionSort {
    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void sort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = new int[]{5, 23, 87, 43, 1};
        selectionSort s = new selectionSort();
        s.print(arr);
        s.sort(arr);
        s.print(arr);
    }
}
