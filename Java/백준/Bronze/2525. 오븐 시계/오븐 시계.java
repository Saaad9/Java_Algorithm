import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
        //  두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.

        // 출력 
        // 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

        String str = br.readLine();

        // 현재 시각 입력
        int H = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);

        //  요리하는 데 필요한 시간 입력
        int spendTime = Integer.parseInt(br.readLine());

        // 입력값 검증
        if (H < 0 && H > 23) {
            System.out.println("H의 값이 범위를 벗어났습니다.");
            return;
        }
        if (M < 0  && M > 59) {
            System.out.println("M의 값이 범위를 벗어났습니다.");
            return;
        }
        if (spendTime < 0 && spendTime > 1000) {
            System.out.println("spendTime의 값이 범위를 벗어났습니다.");
            return;
        }

        int m_result = M + spendTime;

        if (m_result >= 60) {
            H += m_result / 60;
            m_result = m_result % 60;
        } 
        
        // 24시 이상일 경우 24로 나눈 나머지 값으로 변경
        if (H >= 24) {
            H = H % 24;
        }
        
        System.out.println(H + " " + m_result);
    

        
    }
}
