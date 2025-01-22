import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String reverse_str = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse_str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
      
    }
}