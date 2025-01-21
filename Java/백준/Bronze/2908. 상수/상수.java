import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        // StringBuilder를 이용하여 문자열 뒤집기
        String reverse_A = new StringBuilder(A).reverse().toString();
        String reverse_B = new StringBuilder(B).reverse().toString();

        if (Integer.parseInt(reverse_A) > Integer.parseInt(reverse_B)) {
            System.out.println(reverse_A);
        } else {
            System.out.println(reverse_B);
        }
    }
}