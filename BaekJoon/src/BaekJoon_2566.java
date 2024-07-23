import java.util.Scanner;

public class BaekJoon_2566 {
    public static void main(String[] args){
        final int row = 9;
        final int col = 9;

        int[][] matrix = new int[row][col];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        //최대 찾기
        int max = matrix[0][0];
        int max_row_idx = 0;
        int max_col_idx = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] >= max){
                    max = matrix[i][j];
                    max_row_idx = i + 1;
                    max_col_idx = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_row_idx + " " + max_col_idx);
    }
}
