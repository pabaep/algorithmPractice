//package algo;
import java.util.Scanner;

public class Q2293 { //Main

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //동전 종류 수
		int k = s.nextInt(); //결과 얻고 싶은 금액
		int[] value = new int[101]; //동전별 가치 보기 편하려고 1~100로 함
		int[] dp = new int[10001]; //보기 편하려고 1~10000로 함
		
		for(int i = 1;i<=n;i++) {
			value[i] = s.nextInt();
		}
		dp[0] = 1;
		for(int i=1;i<=n;i++) {
			for(int j = value[i]; j<=k;j++) {
				dp[j] += dp[j-value[i]];
			}
		}
		System.out.println(dp[k]);
	}

}
