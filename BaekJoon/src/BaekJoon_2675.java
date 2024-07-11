import java.util.Scanner;

public class BaekJoon_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //입력받을 문자열 개수
        scanner.nextLine(); //엔터키 먹음

        for(int i = 0; i < N; i++){
            String input = scanner.nextLine(); //숫자와 문자열 한 번에 입력받기

            String[] buf = input.split("\\s"); //공백마다 구분

            int repeat = Integer.parseInt(buf[0]); //문자 반복 횟수
            String word = buf[1]; //입력받은 문자열

            //출력
            for(int j = 0; j < word.length(); j++){ //알파벳 각각을
                for(int k = 0; k < repeat; k++){ //반복횟수만큼 반복
                    System.out.printf("%c",word.charAt(j));
                }
            }
            System.out.println(); //줄바꿈

        }


    }
}