import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 

        StringTokenizer st = new StringTokenizer(br.readLine()); 

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        int[][] graph = new int[N+1][N+1]; // 표 

        // 가로 합배열 
        int[][] sum_horizontal = new int[N+1][N+1]; 
        

        // 표 채우는 코드 
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine()); 
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken()); 
                sum_horizontal[i][j] = graph[i][j] + sum_horizontal[i][j-1];
            }
        }

        // 2차원 배열의 구간 합 
        int x1, y1, x2, y2 = 0;
        for (int i = 1; i <= M; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine()); 
            
            x1 = Integer.parseInt(st.nextToken()); 
            y1 = Integer.parseInt(st.nextToken()); 
            x2 = Integer.parseInt(st.nextToken()); 
            y2 = Integer.parseInt(st.nextToken()); 

            for (int x = x1; x <= x2; x++) { 
                sum += (sum_horizontal[x][y2] - sum_horizontal[x][y1-1]);
            }

            // System.out.println(sum);
            sb.append(sum); sb.append('\n'); 

        }

        sb.toString();
        
    }
}
