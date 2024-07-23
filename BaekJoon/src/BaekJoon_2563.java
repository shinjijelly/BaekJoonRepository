import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2563 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt(); //색종이의 개수
        scanner.nextLine(); //공백 먹음

        int[][] black = new int[100][100];
        for(int i = 0; i < 3; i++)
            Arrays.fill(black[i],0); //초기값 = 0

        for(int i = 0; i < N; i++){
            String input = scanner.nextLine(); //한 줄 입력
            String[] buf = input.split("\\s");
            int[] coordinate = new int[2]; //좌표

            for(int j = 0; j < 2; j++){
                coordinate[j] = Integer.parseInt(buf[j]);
            }

            int x = coordinate[0];
            int y = coordinate[1];

            //x 좌표
            for(int k = x; k < x + 10; k++){
                for(int l = y; l < y + 10; l++) {
                    black[k][l] = 1; //검은 영역
                }
            }

        }

        int count = 0; //검은 영역의 개수

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(black[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
