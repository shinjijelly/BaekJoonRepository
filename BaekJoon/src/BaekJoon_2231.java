import java.util.Scanner;

public class BaekJoon_2231 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int maxSum = 0;

        for(int i = 0; i < N; i++){
            int sum = 0; //각 자릿수 합
            int iClone = i;

            while(iClone >= 1){
                sum += iClone % 10;
                iClone /= 10;
            }

            if(sum > maxSum && sum + i == N){
                maxSum = sum;
            }
        }

        if(maxSum == 0) System.out.println("0");
        else System.out.println(N - maxSum);
    }
}
