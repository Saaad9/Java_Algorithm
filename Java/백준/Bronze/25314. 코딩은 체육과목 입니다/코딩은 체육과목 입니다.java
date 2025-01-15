import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력
        // 첫 번째 줄에는 문제의 정수 N이 주어진다.

        // 출력 
        // 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.

        int N = Integer.parseInt(br.readLine());

        if (N % 4 != 0){
            System.out.println("입력 형식을 확인해주세요");
            return;
        }

        for (int i = 0; i < N/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
     }
}
