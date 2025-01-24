import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 9 x 9 행렬 생성
        int[][] A = new int[9][9];

        // 행렬 입력
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = -1;
        int row = 0, col = 0;

        // 행렬을 순회하며 최댓값 탐색
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    row = i+1; col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);;
    }
}
