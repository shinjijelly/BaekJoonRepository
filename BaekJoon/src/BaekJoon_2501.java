import java.util.Scanner;

public class BaekJoon_2501 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] buf = input.split("\\s");
        int N = Integer.parseInt(buf[0]);
        int K = Integer.parseInt(buf[1]);
        int cnt = 0;

        for(int i = 1; i <= N; i++){
            if(N % i == 0) cnt++;
            if(cnt == K) {
                System.out.println(i);
                break;
            }
        }
        if(cnt < K) System.out.println("0");
    }
}
