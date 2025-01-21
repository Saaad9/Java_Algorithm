import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import java.util.Scanner;
import java.util.StringTokenizer;

class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S, " "); //공백 기준으로 S 문자열 쪼개기
        System.out.println(st.countTokens());
    }
}