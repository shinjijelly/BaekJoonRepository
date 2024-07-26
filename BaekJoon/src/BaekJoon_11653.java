import java.util.Scanner;

public class BaekJoon_11653 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N == 1) return;

        for(int i = 2; i <= N; i++){
            while(N % i == 0){
                System.out.println(i);
                N /= i;
            }
        }
    }
}
