package DataStructure;

public class Sum_001 {

    public void main(int n, String target) {

        /* 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        String target = sc.next(); 

        */

        int sum = 0; 
        for (int i = 0; i < n; i++) {

            sum += (target.charAt(i) - '0'); 

        }

        System.out.println(sum);

    }


}