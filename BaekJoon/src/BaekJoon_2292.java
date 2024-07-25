import java.util.Scanner;

public class BaekJoon_2292 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 2; //반복문 돌리는 변수
        int res = 1; //지나가는 방의 수 결과

        while(true){
            if(N == 1) break;
            res++;
            if(i <= N && N < i + (6 * (res - 1))){ //6개씩
                break;
            }
            else {
                i += 6 * (res - 1);
            }
        }
        System.out.println(res);
    }
}
