import java.util.Scanner;

public class BaekJoon_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            char[] chrArr = scanner.next().toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = chrArr[j];
            }
        }

        int cnt = 0;
        int minCnt = 32;

        //첫번째 반복, 기준이 'W'일 때
        for (int k = 0; k < N - 7; k++) {
            for(int l = 0; l < M - 7; l++) {
                char state = 'W'; //기준
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((k + i) % 2 == 1 && (l + j) % 2 == 1) { //홀수 행, 홀수 열일 때
                            if (state != arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 1 && (l + j) % 2 == 0) { //홀수 행, 짝수 열
                            if (state == arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 0 && (l + j) % 2 == 0) { //짝수 행, 짝수 열
                            if (state != arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 0 && (l + j) % 2 == 1) {
                            if (state == arr[k + i][l + j]) cnt++;
                        }
                    }

                }
                if(cnt < minCnt) {
                    minCnt = cnt;
                }
                cnt = 0;

            }


    }

        //두번째 반복, 기준이 'B'일 때
        for (int k = 0; k < N - 7; k++) {
            for(int l = 0; l < M - 7; l++) {
                char state = 'B'; //기준
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((k + i) % 2 == 1 && (l + j) % 2 == 1) { //홀수 행, 홀수 열일 때
                            if (state != arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 1 && (l + j) % 2 == 0) { //홀수 행, 짝수 열
                            if (state == arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 0 && (l + j) % 2 == 0) { //짝수 행, 짝수 열
                            if (state != arr[k + i][l + j]) cnt++;
                        } else if ((k + i) % 2 == 0 && (l + j) % 2 == 1) {
                            if (state == arr[k + i][l + j]) cnt++;
                        }
                    }

                }
                if(cnt < minCnt) {
                    minCnt = cnt;
                }
                cnt = 0;

            }


        }
        System.out.println(minCnt);
    }
}
