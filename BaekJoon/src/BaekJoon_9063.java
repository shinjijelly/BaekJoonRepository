import java.util.Scanner;

public class BaekJoon_9063 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); //공백 먹기
        int max1 = -10000, max2 = -10000;
        int min1 = 10000, min2 = 10000;

        for(int i = 0; i < N; i++){
            String input = scanner.nextLine();
            String[] buf = input.split("\\s");
            int n1 = Integer.parseInt(buf[0]);
            int n2 = Integer.parseInt(buf[1]);

            if(n1 > max1) max1 = n1;
            if(n1 < min1) min1 = n1;
            if(n2 > max2) max2 = n2;
            if(n2 < min2) min2 = n2;

        }
        System.out.println((max1 - min1) * (max2 - min2));
    }
}
