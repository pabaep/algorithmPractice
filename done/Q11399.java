import java.io.*;
import java.util.*;

public class Q11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nList = new int [n];//각 사람별 시간 저장소
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<n;i++) {
			
			nList[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nList);
		for(int i = 0;i<n-1;i++) {
			nList[i+1] = nList[i] +nList[i+1];
		}
		for(int i = 0;i<n;i++) {
			result += nList[i];
		}
		System.out.println(result);
	}

}
