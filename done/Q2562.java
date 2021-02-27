import java.io.*;

public class Q2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int max = 0; // 최댓값
		int num = 0; // 최댓값의 위치
		int cnt = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int value : arr) {
			cnt++;
			if(value > max) {
				max = value;
				num = cnt;
			}
		}
		sb.append(max+"\n");
		sb.append(num);
		System.out.println(sb);
	}

}
