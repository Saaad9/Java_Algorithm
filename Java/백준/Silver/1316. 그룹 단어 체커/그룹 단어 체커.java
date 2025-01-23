import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int count = 0;
        int num = Integer.parseInt(br.readLine()); // 입력한 단어의 개수

        for (int i = 0; i < num; i++) {
            if (check() == true)
                count++;
        }
        System.out.print(count);
    }

    public static boolean check() throws IOException {// aabbcc
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine(); // 문자열 입력

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); // i번째 문자 저장

            // 앞선 문자와 i번째 문자가 같지 않다면?
            if (prev != now) {

                // 해당문자가 처음 나오는 경우
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true; // 문자 등장여부 true로 변경
                    prev = now; // 현재 단어를 prev에 저장
                }

                // 해당 문자가 이미 나온 적이 있다면(그룹단어 x)
                else {
                    return false;
                }
            }
        }
        return true;
    }
}