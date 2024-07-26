import java.util.Scanner;

public class BaekJoon_1978 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //개수 N
        scanner.nextLine(); //엔터키 먹기

        String input = scanner.nextLine();
        String[] buf = input.split("\\s");
        int res = 0; //소수의 개수

        for(int i = 0; i < N; i++){
            int cnt = 0; //약수의 개수
            int num = Integer.parseInt(buf[i]);

            for(int j = 1; j < num; j++){
                if(num % j == 0) cnt++;
            }
            if(cnt == 1) res++;
        }
        System.out.println(res);
    }
}
