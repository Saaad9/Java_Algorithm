import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문제
        /* 
           n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
         */
        
        // 입력
        //첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

        // 출력 
        // 1부터 n까지 합을 출력한다.

        int N = Integer.parseInt(br.readLine());

        int sum = (N*(N + 1)) / 2;

        System.out.println(sum);
    }
}
