import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); 

        st = new StringTokenizer(br.readLine()); 
        int[] arr = new int[N+1]; 

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
        }
        

        Arrays.sort(arr); 

        int start_idx = 1; int end_idx = N; int count = 0; 

        while (start_idx < end_idx) {

            int sum = arr[start_idx] + arr[end_idx]; 

            if (sum == M) {
                count++; 
                start_idx++; end_idx--; 
            }

            else if (sum > M) {
                end_idx--; 
            }

            else if(sum < M) {
                start_idx++;
            }
        }

        System.out.println(count); 
        
    }
}
