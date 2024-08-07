import java.util.Scanner;

public class BaekJoon_25305 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int N = Integer.parseInt(buf[0]);
        int k = Integer.parseInt(buf[1]);

        String[] scoresBuf = scanner.nextLine().split("\\s");
        int[] scores = new int[scoresBuf.length];

        for(int i = 0; i < scores.length; i++){
            scores[i] = Integer.parseInt(scoresBuf[i]);
        }

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores.length; j++){
                if(scores[i] > scores[j]){
                    int tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                }
            }
        }

        System.out.println(scores[k - 1]);
    }
}
