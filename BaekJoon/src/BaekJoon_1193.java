import java.util.Scanner;

public class BaekJoon_1193 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int i = 1, j = 1, cnt = 1;

        //X가 1일 때
        if(X == 1) {
            System.out.println(i + "/" + j);
            return;
        }

        //X가 1보다 클 때
        Loop1 : while(true){
            if((i == 1) && (j % 2 == 1)){
                j++; cnt++;
                if(cnt >= X) {
                    System.out.println(i + "/" + j);
                    break;
                }
            }
            while(j > 1){
                i++; j--; cnt++;
                if(cnt >= X) {
                    System.out.println(i + "/" + j);
                    break Loop1;
                }
            }
            if((j == 1) && (i % 2 == 0)){
                i++; cnt++;
                if(cnt >= X) {
                    System.out.println(i + "/" + j);
                    break;
                }
            }
            while(i > 1){
                i--; j++; cnt++;
                if(cnt >= X) {
                    System.out.println(i + "/" + j);
                    break Loop1;
                }
            }
        }
    }
}
