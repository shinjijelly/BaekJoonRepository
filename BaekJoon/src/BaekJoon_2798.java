import java.util.Scanner;

public class BaekJoon_2798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int N = Integer.parseInt(buf[0]); //카드의 개수
        int M = Integer.parseInt(buf[1]); //기준 수

        int[] arr = new int[N]; //카드의 수를 저장할 배열

        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }

        int maxSum = 0;

        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                for(int k = j + 1; k < N; k++){
                    int middleSum = arr[i] + arr[j] + arr[k];
                    if(maxSum < middleSum && middleSum <= M){
                        maxSum = middleSum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
