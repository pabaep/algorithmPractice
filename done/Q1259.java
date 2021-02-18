import java.io.*;

public class Q1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int [] nList = new int[5];//각 자리 담을 배열
		int tmp;
		boolean tf = false;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			int len = (Integer.toString(n)).length(); // n의 길이
			if(len == 1) {
				sb.append("yes\n");
			}
			else {
				// 숫자를 자리수 대로 배열에 넣기
				tmp = n;
				for(int i = 0;i<len;i++) {
					nList[len-1-i] = tmp%10;
					tmp = tmp/10;
				}
				for(int i = 0;i<len/2;i++) {
					if(nList[i] != nList[len-1-i]) {
						tf = false;
						break;
					}
					tf = true;
				}
				if(tf == false) {
					sb.append("no\n");
				}
				else {
					sb.append("yes\n");
				}
			}
		}
		System.out.println(sb);

	}

}
