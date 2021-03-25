import java.io.*;
import java.util.*;

public class Q1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nList = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<n;i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nList);
		float m = nList[n-1];
		float result = 0;
		for(int i = 0;i<n;i++) {
			result += ((nList[i]/m)*100);
		}
		System.out.println(result/n);
		

	}

}
