import java.util.*;
import java.io.*;

public class Q2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine()); //3자리
		int b = Integer.parseInt(br.readLine()); //3자리
		
		int mul = a*b;//최종 곱한 값
		int tmp;
		
		for(int i = 0;i<3;i++) {
			tmp = b%10;
			b = b/10;
			sb.append(a*tmp+"\n");
		}
		sb.append(mul);
		System.out.println(sb);

	}

}
