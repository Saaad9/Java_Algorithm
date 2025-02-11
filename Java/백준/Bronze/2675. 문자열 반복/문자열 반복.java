import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());

        
        for (int i = 0; i < T; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 반복 횟수
            String str = st.nextToken(); // 반복할 문자열

            for (int j = 0; j < str.length(); j++) {
                String c = String.valueOf(str.charAt(j));
                sb.append(c.repeat(n));
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}