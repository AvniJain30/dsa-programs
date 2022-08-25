public class printMatrixInSpiralForm {
    public void spiral(int[][] matrix, int r, int c){
        int i, k = 0, l = 0;             // k represents row, l represents column
        while(k < r && l < c){
            for(i = l; i < c; i++){             // left to right
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i = k; i < r; i++){         // top to bottom
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if(k < r){
                for(i = c - 1; i >= l ; i--){     // right to left
                    System.out.print(matrix[r - 1][i] + " ");
                }
                r--;
            }
            if(l < c){
                for(i = r - 1; i >= k ; i--){     // bottom to top
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args){
        printMatrixInSpiralForm p = new printMatrixInSpiralForm();
        int [][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51}
        };
        p.spiral(matrix, matrix.length, matrix[0].length);
    }
}
