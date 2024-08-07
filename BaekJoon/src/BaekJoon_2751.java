import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(bf.readLine()));
        }

        Collections.sort(arr);

        for(int i : arr){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
