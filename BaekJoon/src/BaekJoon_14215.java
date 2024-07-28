import java.util.Scanner;

public class BaekJoon_14215 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] buf = input.split("\\s");

        int[] n = new int[3];
        int max = 0, idx = 0;

        for(int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(buf[i]);
        }

        for(int i = 0; i < n.length; i++){
            if(n[i] > max){
                max = n[i];
                idx = i;
            }
        }

        int sum = 0;
        for(int i = 0; i < n.length; i++){
            if(i != idx){
                max -= n[i];
                sum += n[i];
            }
        }

        if(max >= 0) n[idx] = sum - 1;
        System.out.println(n[0] + n[1] + n[2]);
    }
}
