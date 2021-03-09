import java.io.*;
import java.util.*;

public class Q4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a=0,b=0,c=0;
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0 ) {
				break;
			}
			if((a*a+b*b)==(c*c)) {
				sb.append("right\n");
			}
			else if((b*b+c*c)==(a*a)) {
				sb.append("right\n");
			}
			else if((c*c+a*a)==(b*b)) {
				sb.append("right\n");
			}
			else {
				sb.append("wrong\n");
			}
		}
		System.out.println(sb);

	}

	

}
