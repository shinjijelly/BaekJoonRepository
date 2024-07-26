import java.util.Scanner;

public class BaekJoon_1085 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] buf = input.split("\\s");

        int[] xy = new int[2];
        xy[0] = Integer.parseInt(buf[0]);
        xy[1] = Integer.parseInt(buf[1]);

        int[] wh = new int[2];
        wh[0] = Integer.parseInt(buf[2]);
        wh[1] = Integer.parseInt(buf[3]);

        int min = xy[0];

        for(int i = 0; i < 2; i++){
            if((int)(Math.abs(xy[i] - wh[i])) < min){
                min = (int)(Math.abs(xy[i] - wh[i]));
            }

            if(xy[i] < min){
                min = xy[i];
            }
        }
        System.out.println(min);
    }
}
