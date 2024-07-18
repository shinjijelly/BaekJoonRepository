import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1157 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        final int MAX_SIZE = 'z' - 'a' + 1;
        int[] counts = new int[MAX_SIZE];

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < counts.length; j++){
                if((str.charAt(i) == 'A' + j) || (str.charAt(i) == 'a' + j))
                    counts[j]++;
            }
        }
       // System.out.println(Arrays.toString(counts));
        int max_cnt = 0; //최대 개수
        int max_index = 0; //최대 인덱스

        for(int i = 0; i < counts.length; i++){
            if(counts[i] > max_cnt){
                max_cnt = counts[i]; //최댓값 업데이트
                max_index = i;
            }
        }

        for(int i = 0; i < MAX_SIZE; i++){
            if((counts[i] == max_cnt) && (i != max_index)){
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)('A' + max_index));
    }
}
