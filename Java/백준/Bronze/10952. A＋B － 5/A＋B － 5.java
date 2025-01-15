import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        /*  입력
            입력은 여러 개의 테스트 케이스로 이루어져 있다.
            각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
            입력의 마지막에는 0 두 개가 들어온다.
         */

         /* 출력
           각 테스트 케이스마다 A+B를 출력한다.
          */
  
        while (true) { 
            String str = br.readLine();
            int A = Integer.parseInt(str.split(" ")[0]);
            int B = Integer.parseInt(str.split(" ")[1]);
            
            if (A == 0 && B == 0) {
                break;
            }
            sb.append(A + B).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
