import java.util.*;
import java.io.*;

public class Q10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x,y;
			if(n%h == 0) {
				y = h*100;
				x = n/h;
			}
			else {
				y = (n%h)*100;
				x = (n/h) + 1;
			}
			sb.append(y+x + "\n");
		}
		System.out.println(sb);

	}

}
