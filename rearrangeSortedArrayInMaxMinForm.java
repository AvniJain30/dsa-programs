public class rearrangeSortedArrayInMaxMinForm {
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void arrangeMaxMin(int arr[]){
        int maxInd = arr.length - 1;
        int minInd = 0;
        int max = arr[maxInd] + 1;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + (arr[maxInd] % max) * max;
                maxInd--;
            }
            else{
                arr[i] = arr[i] + (arr[minInd] % max) * max;
                minInd++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] / max;
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr);
        arrangeMaxMin(arr);
        print(arr);
    }
}
