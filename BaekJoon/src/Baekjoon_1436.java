import java.util.Scanner;

public class Baekjoon_1436 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cnt = 0;
        int i = 0;

        while(true){
            int numNext = i;
            int nextCnt = 0;

            while(numNext >= 1){
                if(numNext % 10 == 6) {
                    nextCnt++;
                }
                else{
                    nextCnt = 0;
                }

                if(nextCnt == 3){
                    cnt++;
                    break;
                }
                numNext /= 10;
            }
            //종료 조건
            if(cnt == N){
                System.out.println(i);
                break;
            }
            i++;
        }



    }
}
