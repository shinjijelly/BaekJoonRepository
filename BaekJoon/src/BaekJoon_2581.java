import java.util.Scanner;

public class BaekJoon_2581 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int check = 0; //최솟값이 아직 없으면 0, 있으면 1
        int sum = 0; //소수들의 합
        int min = 0; //소수 최솟값

        for(int i = M; i <= N; i++){
            int cnt = 0; //약수의 개수

            for(int j = 1; j < i; j++){ //소수 판별
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 1 && check == 0){ //최솟값 찾기
                min = i;
                check = 1;
            }
            if(cnt == 1) sum += i;
        }
        if(sum == 0) System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
