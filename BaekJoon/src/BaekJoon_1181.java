import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class BaekJoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Vector<String> v = new Vector<>();

        for(int i = 0; i < N; i++){
            v.add(br.readLine());
        }

        v.sort((v1, v2) -> {
            if (v1.length() > v2.length()) {
                return 1;
            } else if (v1.length() < v2.length()) {
                return -1;
            } else {
                return v1.compareTo(v2);
            }
        });


        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < N; i++) {
            if(i == 0) sb.append(v.get(i)).append("\n");

            else if (!v.get(i - 1).equals(v.get(i))) {
                sb.append(v.get(i)).append("\n");
            }

        }

        System.out.println(sb);
    }
}
