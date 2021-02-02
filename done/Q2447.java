import java.io.*;

public class Q2447 {
	static char[][] result;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		result = new char[n][n];
		StringBuilder sb = new StringBuilder();
		star(0,0,n,false);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(result[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);

	}
	static void star(int x,int y,int n, boolean blank) {
		if(blank==true) { //공백일 경우
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					result[i][j] = ' ';
				}
			}
			return;
		}
		
		if (n == 1) { //디폴트
			result[x][y] = '*';
			return;
		}

		int size = n / 3; //3 단위로 쪼갬
		int cnt = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				cnt++;
				if (cnt == 5) { // 공백 칸일 경우->5일때 마다 공백이 오게 되어있음(가장 작은 단위에서 도출한 생각)
					star(i, j, size, true);//재귀
				} else {
					star(i, j, size, false);
				}
			}
		}
	}

}
