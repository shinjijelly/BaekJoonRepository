import java.util.Scanner;

public class BaekJoon_2444 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //정수 입력받기

        //위 삼각형
        for(int i = N; i > 1; i--){
            for(int j = i - 1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < N - i + 1; k++){
                System.out.print("*");
            }
            for(int k = 0; k < N - i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 0; i< N * 2 - 1; i++){
            System.out.print("*");
        }
        System.out.println();

        //아래 삼각형
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < N - i; k++){
                System.out.print("*");
            }
            for(int k = 1; k < N - i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


