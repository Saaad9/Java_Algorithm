import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
         * 첫째 줄에 N (1 ≤ N ≤ 100)과 M C(1 ≤ M ≤ 100)이 주어진다.
         * 
         * 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에
         * 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
         * 
         * 도현이는 입력으로 주어진 순서대로 공을 교환한다.
         */

        //  1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N개의 원소를 가진 일차원 배열 선언
        int[] arr = new int[N];

        // 바구니에 적혀있는 번호와 같은 번호로 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int range1 = Integer.parseInt(st2.nextToken());
            int range2 = Integer.parseInt(st2.nextToken());
            
            // 값 교환
            int temp = arr[range1 - 1];
            arr[range1 - 1] = arr[range2 - 1];
            arr[range2 - 1] = temp;
        }

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}