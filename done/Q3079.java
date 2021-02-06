import java.util.*;
import java.io.*;

public class Q3079 {

	static int[] t;
	static long max = 0;
	static long result = Long.MAX_VALUE; // 결과값에 우선 엄청 큰 값을 넣어둠
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		t = new int[n];
		
		for(int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, t[i]);// 가장 오래 걸리는 심사대의 소요 시간
		}
		
		getMinTime(n, m);
		System.out.println(result);
	}
	

	static void getMinTime(int n, int m) {
		long low = 0;
		long high = max * m;
		

		while(low <= high) {
			long mid = (low + high) / 2;
			long sum = 0; // 각 심사대별 최대 인원수 더한 값
			
			for(int element : t) {
				long cnt = mid / element;// mid초 내에 해당 심사대에서 심사 받을 수 있는 최대 인원수 
				
				
				if(sum >= m) {
					break;
				}
				
				sum += cnt;
			}
			
			
			
			if(sum >= m) {
				result = Math.min(result, mid);
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
	}

}
