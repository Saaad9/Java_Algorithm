import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        /*
         * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
         * 
         * 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번
         * 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는
         * 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
         * 
         * 도현이는 입력으로 주어진 순서대로 공을 넣는다.
         */


        // 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 
        // 공이 들어있지 않은 바구니는 0을 출력한다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N개의 원소를 가진 일차원 배열 선언
        int [] arr = new int[N];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int range1 = Integer.parseInt(st2.nextToken());
            int range2 = Integer.parseInt(st2.nextToken());
            int ball_number = Integer.parseInt(st2.nextToken());

            // range1 ~ range2 바구니에 ball_number 저장
            for (int j=range1; j<=range2; j++) {
                arr[j-1] = ball_number;
            }
        }

        for (int i=0; i<N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}