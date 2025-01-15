import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문제
        /* 
           두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
         */
        
        // 입력
        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        // 출력 
        // 각 테스트 케이스마다 A+B를 출력한다.

        // 아이디어
        // for문을 사용하여 입력받은 횟수만큼 반복하며 배열에 담아놨다가 또 한번 반복문을 통해 출력한다
        
        // for문 반복 횟수
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            int A = Integer.parseInt(str.split(" ")[0]);
            int B = Integer.parseInt(str.split(" ")[1]);
        
            arr[i] = A + B;
        }
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
