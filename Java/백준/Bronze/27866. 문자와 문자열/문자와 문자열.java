import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 문자열을 입력받고 입력한 정수의 순서의 문자를 출력하는 예제

        // 문자열 입력 받기
        String str = br.readLine();

        // i번 째 정수 입력 받기
        int N = Integer.parseInt(br.readLine());

        // charAt 메소드를 이용해 해당하는 인덱스 번째의 글자를 출력
        char c = str.charAt(N - 1);
        
        System.out.println(c);
        
    }
}