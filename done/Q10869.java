import java.io.*;
import java.util.*;

public class Q10869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(a + b + "\n");
		sb.append(a - b + "\n");
		sb.append(a * b + "\n");
		sb.append(a / b + "\n");
		sb.append(a % b + "\n");
		
		System.out.println(sb);
	}
}
