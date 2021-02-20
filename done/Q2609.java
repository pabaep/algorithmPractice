import java.util.*;
import java.io.*;

public class Q2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int GCD = gcd(n,m);
		int LCM = GCD * (n/GCD) * (m/GCD);
		
		sb.append(GCD + "\n");
		sb.append(LCM + "\n");
		
		System.out.println(sb);

	}
	//유클리드 호제법
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
}
