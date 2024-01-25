import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); // 시험 본 과목 개수 

        // 시험 성적을 배열로 저장 
        double [] records = new double[N]; 
        
        double max = -Double.MIN_VALUE;
        for (int i = 0; i < N; i++) { 

            records[i] = sc.nextInt(); 

            max = (max >= records[i]) ? max : records[i];

        }

        double sum = 0; 
        for (int i = 0; i < N; i++) { 

            records[i] = (records[i] / max) * 100; 
            sum += records[i]; 
        }

        System.out.println(sum / N); 

        sc.close();
        
    }
}