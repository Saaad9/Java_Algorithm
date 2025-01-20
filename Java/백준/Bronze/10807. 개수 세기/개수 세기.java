import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오

        // 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 비교할 정수
        int v = Integer.parseInt(br.readLine());

        for(int i=0; i< arr.length; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);

    }
}
