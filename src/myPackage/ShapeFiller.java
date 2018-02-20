package myPackage;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ShapeFiller {

	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[][] res;
        int matrix_rows = 0;
        int matrix_cols = 0;
        matrix_rows = Integer.parseInt(in.nextLine().trim());
        matrix_cols = Integer.parseInt(in.nextLine().trim());

        int[][] matrix = new int[matrix_rows][matrix_cols];
        for(int matrix_i = 0; matrix_i < matrix_rows; matrix_i++) {
            for(int matrix_j = 0; matrix_j < matrix_cols; matrix_j++) {
                matrix[matrix_i][matrix_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
          in.nextLine();
        }

        res = fillShape(matrix);
        int res_rowLength = res.length;
        int res_colLength = res[0].length;
        for(int res_i = 0; res_i < res_rowLength; res_i++) {
            for(int res_j = 0; res_j < res_colLength; res_j++) {
                bw.write(String.valueOf(res[res_i][res_j]) + " ");
            }
            bw.newLine();
        }

        bw.close();
    }

	
	

    /*
     * Complete the function below.
     */
	public static int[][] fillShape(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++    ){
              int start = -1 ;
              int end = -1 ;

             for(int j = 0 ; j < matrix[0].length ; j++    ){
               if(start == -1 && matrix[i][j] == 1) {
                   start = j + 1;
               }

                if ( matrix[i][j] == 1   ) {
                     end = j;
                 }
                 fill(matrix , i , start , end);
             }
        }
        return matrix;
    }

    public static void fill(int[][] matrix , int row , int start_ , int end_){
        
        for( int r = start_  ; r < end_ ; r++){
            matrix[row][r] = 1;
        }
        
    }


	
}
