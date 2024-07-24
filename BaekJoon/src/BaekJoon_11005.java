import java.util.Scanner;

public class BaekJoon_11005 {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] buf = input.split("\\s");

        int N = Integer.parseInt(buf[0]); //숫자
        int B = Integer.parseInt(buf[1]); //진법
        int nRange = N;

        for(int i = 30; i >= 0; i--){
            if((int)Math.pow(B, i) <= nRange) {

                if((int) (N / Math.pow(B, i)) >= 10 && B > 10){ //10을 넘어가는 숫자
                    //System.out.print("N = " + N + " ");
                    System.out.print((char)((int) (N / Math.pow(B, i)) - 10 + 'A'));
                }
                else {
                    //System.out.print("N = " + N + " ");
                    System.out.print((int) (N / Math.pow(B, i)));
                }
                N %= Math.pow(B, i);
            }
        }

    }
}
