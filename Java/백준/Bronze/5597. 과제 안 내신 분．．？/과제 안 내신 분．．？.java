import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
         * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.

          교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
         */
        int [] arr = new int [30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr [num - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.print(sb.toString());

    }
}
