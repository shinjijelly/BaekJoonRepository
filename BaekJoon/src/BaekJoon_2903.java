import java.util.Scanner;

public class BaekJoon_2903 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int range = 2; //초기값은 2(점 4개)
        for(int i = 0; i < N; i++){
            range += (int)Math.pow(2,i);
        }

        int result = range * range;
        System.out.println(result);
    }
}
