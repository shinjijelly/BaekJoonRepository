import java.util.Scanner;

public class BaekJoon_2839 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //킬로그램
        int cnt = 0;

        while(N / 5 >= 1){
            N -= 5;
            cnt++;
            //System.out.println("5 들음 " + cnt);
        }
        if(N % 3 != 0){
            while(cnt > 0){
                if(N % 3 == 0) break;
                N += 5;
                cnt--;
               // System.out.println("5 취소 " + cnt);
            }
        }
        while(N / 3 >= 1){
            N -= 3;
            cnt++;
            //System.out.println("3 들음 " + cnt);
        }


        if(N != 0) System.out.println("-1");
        else System.out.println(cnt);
    }
}
