import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문제 옮길땐 항상 Main 클래스로 바꿔서 제출하기
// 20230413
public class Q11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void hanoi(int n, int start, int bypass, int end)
    {
        //탈출 조건, 원판이 하나이면 탈출
        if(n == 1){
            sb.append(start + " " + end + "\n");
            return;
        }

        // 제일 큰 원판 제외(A) 옮기기 (중간의 빈 곳으로)
        hanoi(n-1, start, end, bypass);

        // 제일 큰 원판 최종 목적지로 옮기기
        sb.append(start + " " + end + "\n");

        // A 원판 목적지로 옮기기
        hanoi(n-1, bypass, start, end);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 입력받은 n 

        // 최소한으로 옮기는 움직임 수 계산
        sb.append((int) (Math.pow(2,n)-1)).append("\n");
        
        hanoi(n, 1, 2, 3);
        System.out.println(sb);

    }
}
