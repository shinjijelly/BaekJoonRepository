import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();

        String[] res = str.split("");

        Arrays.sort(res, Collections.reverseOrder());

        for(String value : res){
            sb.append(value);
        }
        System.out.println(sb);

    }
}
