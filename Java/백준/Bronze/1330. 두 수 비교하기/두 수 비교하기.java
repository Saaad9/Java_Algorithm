import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        
        String input = br.readLine();

        int A = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);

        // A > B 
        if (A > B) {
            System.out.println(">");
        }
        // A < B
        else if (A < B) {
            System.out.println("<");
        }
        // A == B
        else {
            System.out.println("==");
        }
    }
}
