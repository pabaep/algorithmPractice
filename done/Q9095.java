import java.util.*;

public class Q9095 {
	
	static int dp[] = new int [11];
	
	public static void main(String[] args)   {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = s.nextInt();
		// 초기 값 초기화
		dp[1] = 1; 
		dp[2] = 2;
		dp[3] = 4;
		
		for(int j=4;j<=10;j++) { // 4부터 반복
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1]; // 점화식
		}
		
		for(int i=0;i<n;i++) {
			int result = s.nextInt(); // 구하려는 값들
			
			sb.append(dp[result]+"\n");
		}
		System.out.println(sb);

	}
	
}
