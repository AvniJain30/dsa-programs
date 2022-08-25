public class sortArrayOf_0_1_2 {

    public void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void sort(int arr[]){
        int i = 0, j = 0, k = arr.length - 1;
        while(i <= k){
            if(arr[i] == 0){
                swap1(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else{
                swap2(arr, i, k);
                k--;
            }
        }
    }

    private void swap1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void swap2(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }

    public static void main(String[] args){
        sortArrayOf_0_1_2 s = new sortArrayOf_0_1_2();
        int arr[] = new int[]{2, 1, 0, 2, 1, 1, 0, 2};
        s.print(arr);
        s.sort(arr);
        s.print(arr);
    }

}
