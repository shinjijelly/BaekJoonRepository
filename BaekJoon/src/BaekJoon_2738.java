import java.util.Scanner;

public class BaekJoon_2738 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int row = scanner.nextInt(); //행
        final int col = scanner.nextInt(); //열

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        //덧셈
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
