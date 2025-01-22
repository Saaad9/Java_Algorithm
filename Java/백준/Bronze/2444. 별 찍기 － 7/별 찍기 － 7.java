import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            // i일 때 N-i번 공백 출력
            sb.append(" ".repeat(N - i));
            // i일 때 2*i-1개 * 출력
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        for (int i = 1; i <= N - 1; i++) {
            // i일 때
            sb.append(" ".repeat(i));
            sb.append("*".repeat(2 * (N - i) - 1));
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}