import java.util.Scanner;

public class BaekJoon_3003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] chCounts = input.split("\\s");

        int[] counts = new int[6];
        for(int i = 0; i < 6; i++){
            counts[i] = Integer.parseInt(chCounts[i]);
        }

        int[] origin_counts = {1,1,2,2,2,8};

        for(int i = 0; i < 6; i++){
            System.out.printf("%d ",origin_counts[i] - counts[i]);
        }

    }
}
