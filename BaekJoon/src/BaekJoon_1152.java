import java.util.Scanner;

public class BaekJoon_1152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //문자열 입력
        input = input.trim(); //앞뒤 공백 제거

        int cnt = 0; //단어의 개수
        String[] buf = input.split("\\s"); //공백으로 문자열을 구분해서 buf에 넣는다

        if(!input.isBlank()){ //문자열이 공백일 때는 카운트 하지 않는다
        for(String each : buf) {
            cnt++; //buf를 돌면서 단어의 개수 카운트
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
