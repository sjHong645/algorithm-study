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

        // 2개의 합을 얘기하니까 '투포인터'로 생각하게 된다. 

        long[] arr = new long[N]; 

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken()); 
        }
        
        Arrays.sort(arr); 

        // 앞선 문제들은 합이되는 값이 1개로 정해져있었다면
        // 이번 문제는 그 값이 계속 변경됨 
        // 어차피 배열의 개수가 2000개니까 2중 for문 해도 상관없어보임 

        long target = 0; int count = 0;
        for (int target_idx = 0; target_idx < N; target_idx++) {
            target = arr[target_idx]; 

            int start_idx = 0; int end_idx = N-1; 

            while (start_idx < end_idx) {

                /* 내가 작성한 부분
                if (start_idx == target_idx) {
                    start_idx++; 
                }

                if (end_idx == target_idx) {
                    end_idx--;
                }

                if (start_idx >= end_idx) break;

                if (arr[start_idx] + arr[end_idx] == target) {
                    count++; 
                    break; 
                } */
                
                // 모범 답안이 제시한 코드 
                if (arr[start_idx] + arr[end_idx] == target) {

                    if (start_idx != target_idx && end_idx != target_idx) {
                        count++; 
                        break;
                    } else if (start_idx == target_idx) {
                        start_idx++; 
                    } else if (end_idx == target_idx) {
                        end_idx--;
                    }
                }

                else if (arr[start_idx] + arr[end_idx] > target) {
                    end_idx--;
                }

                else {
                    start_idx++;
                }
            }

        }

        System.out.println(count); 
    }
}
