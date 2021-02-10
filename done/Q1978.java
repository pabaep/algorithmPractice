import java.io.*;
import java.util.*;

public class Q1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int [] num = new int [n];
		for(int i = 0;i<n;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(prime(num[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean prime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2;i<num;i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

}
