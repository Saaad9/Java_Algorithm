import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String [] gradeString = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
       double [] grades = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0 , 0.0};

            
       double scoreSum = 0.0;
       double totalSum = 0.0;

       for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();  // A+ B+.. 

            // 등급이 P면 계산에서 제외
            if(grade.equals("P")) continue;

            scoreSum += score; // 학점의 총합 계산

            for (int j = 0; j < grades.length; j++) {
                if(grade.equals(gradeString[j])) {
                    totalSum += score * grades[j]; // 학점 x 과목평점 (전공평점의 총 합)
                }
            }
       }

       System.out.printf("%.6f",(double)totalSum / scoreSum);
    }
}