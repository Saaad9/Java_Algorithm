import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();

            for(int j = 0; j < 15; j++) {
                // 입력 문자열 길이를 초과하면 continue
                if (j >= str.length()) continue;

                char c = str.charAt(j);

                arr[i][j] = c;
            }
        }

        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (arr[row][col] == '\0') continue;  // (✔) 초기값이 '\0'이면 출력하지 않음
                System.out.print(arr[row][col]);
            }
        }

    }
}
