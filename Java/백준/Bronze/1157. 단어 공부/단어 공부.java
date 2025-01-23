import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase().trim();

        // 배열을 생성하고 새로운 문자열을 만날 때, 배열에 저장
        // 1개씩 돌면서 문자를 꺼내고, 배열의 인덱스를 증가시키며 카운트 1씩 증가

        // 알파벳 배열
        int[] arr = new int[26];

        // -1로 초기화
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'A';

            // 이미 값이 존재하면
            if (arr[index] != -1) {
                arr[index]++;
            } else {
                arr[index] = 1;
            }
        }

        int max = -1; // 초기값 -1
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 'A'); 
            } else if (arr[i] == max) { // 갱신된 max값과 같으면 ? 출력
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}