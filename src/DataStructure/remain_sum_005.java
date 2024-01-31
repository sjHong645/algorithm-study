package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 숫자 개수 <= 1,000,000
        int M = Integer.parseInt(st.nextToken()); // 숫자 개수 <= 1,000,000,000

        float[] arr = new float[N+1]; 
        float[] sum = new float[N+1]; 

        st = new StringTokenizer(br.readLine()); 
        for (int i = 1; i <= N; i++) {
            arr[i] = Float.parseFloat(st.nextToken()); 
            sum[i] = sum[i-1] + arr[i]; 
        }

        int count = 0;
        for (int i = 0; i <= N; i++) {

            for (int j = N; j >= i+1; j--) {

                if ((sum[j] - sum[i]) % M == 0) {

                    count++; 
                }
            }
        }
        System.out.println(count);

        
    }
}

