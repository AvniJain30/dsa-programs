public class SearchInSortedMatrix {
    public void search(int [][] matrix, int n, int k){
        int i = 0;
        int j = n - 1;
        while(i < n && j >= 0){
            if(matrix[i][j] == k){
                System.out.println("k found at : " + i + " , " + j);
                return;
            }
            else if(matrix[i][j] > k){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("k not found!!");
    }

    public static void main(String[] args){
        int [][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
        };

        SearchInSortedMatrix s = new SearchInSortedMatrix();
        s.search(matrix, matrix.length, 56);
    }
}
