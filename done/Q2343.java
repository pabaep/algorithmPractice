import java.io.*;
import java.util.StringTokenizer;

public class Q2343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] lesson = new int [n];
		
		int left = 0;
		int right = 0;
		int mid,sum,cnt;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<n ; i++) {
			lesson[i] = Integer.parseInt(st.nextToken());
			right += lesson[i];
			if(left<lesson[i]) {
				left = lesson[i];
			}

		}
		while(left <= right) {
			mid = (left+right)/2;
			sum = 0; cnt = 0; //cnt가 블루레이 개수
			for(int i = 0;i<n;i++) {
				if(sum + lesson[i]>mid) {
					sum = 0;
					cnt ++;
				}
				sum += lesson[i];
			}
			if (sum != 0) cnt++;
			if(cnt <= m) { //cnt의 블루레이 개수가 지정된 개수를 넘는지 확인
				right = mid-1;
			}
			else {
				left = mid+1;
			}

		}
		System.out.println(left);
	}

}
