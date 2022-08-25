public class linearSearch {
    public static int search(int arr[], int n, int x){
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {3, 1, 5, 34, 78, 34};
        System.out.println(search(arr, arr.length, 34));
    }
}
