import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 

        
        int count = 1; 
        int sum = 1; 
        int start_idx = 1;
        int end_idx = 1; 

        while(end_idx != N) {

            if (sum == N) {
                end_idx++; 
                count++; 
                sum += end_idx; 
            }

            else if (sum > N) {

                sum -= start_idx; 
                start_idx++;
            }

            else {
                end_idx++; 
                sum += end_idx; 
            }
        }

        System.out.println(count);
        


        
    }
}
