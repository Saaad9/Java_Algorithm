import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
        // 입력 시간은 24시간 표현을 사용한다. 
        // 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.


        // 출력 
        // 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

        String str = br.readLine();

        int H = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);

        // 입력값 검증
        if (H < 0 && H > 23) {
            System.out.println("H의 값이 범위를 벗어났습니다.");
            return;
        }
        if (M < 0  && M > 59) {
            System.out.println("M의 값이 범위를 벗어났습니다.");
            return;
        }

        // 45분 전 시간 계산
        
        // 분 계산
        int m_result = M - 45;

        // 45분을 뺐을 때 음수라면
        if(m_result < 0)  {
            H = H - 1;
            M = 60 + m_result;
        }

        // 45분을 뺐을 때 음수가 아니라면 ** 추가했음 ** 
        if(m_result >= 0) {
            M = m_result;
        }

        // 24시간 표현
        if (H < 0) {
            H = 23;
        }

        System.out.println(H + " " + M);
    }
}
