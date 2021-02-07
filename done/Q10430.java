import java.util.*;
import java.io.*;

public class Q10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append((a+b)%c+"\n");
		sb.append(((a%c) + (b%c))%c+"\n");
		sb.append((a*b)%c+"\n");
		sb.append(((a%c) * (b%c))%c+"\n");
		
		System.out.println(sb);
		
	}

}
