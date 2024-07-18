import java.util.Scanner;

public class BaekJoon_1316 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); //공백 먹기

        int cnt = 0; //그룹 단어의 수
        int check = 0; //그룹 단어인지 여부, 그룹이면 0, 아니면 1

        for(int i = 0; i < N; i++){ //N만큼 반복
            String input = scanner.nextLine();
            for(int j = 0; j < input.length(); j++){
                for(int k = j + 1; k <input.length(); k++){
                    if(input.charAt(j) == input.charAt(k) && input.charAt(k - 1) != input.charAt(k)){
                        check = 1; //그룹 단어가 아님
                    }
                }
            }
            if(check == 0){ //그룹단어면 cnt++
                cnt++;
            }
            check = 0; //초기화
        }
        System.out.println(cnt);
    }
}
