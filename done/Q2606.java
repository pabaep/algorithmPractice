import java.io.*;
import java.util.*;

public class Q2606 {

	static int result = 0; // 감염된 컴퓨터 수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 컴퓨터 개수
		int m = Integer.parseInt(br.readLine()); // 네트워크 개수
		boolean check[] = new boolean [n];
		int map[][] = new int [n][n];//기본값 0 설정
		StringTokenizer st;
		int a,b;
		int tmp = 0;
		
		for(int i = 0;i<m;i++) {
			//map에 연결정보 삽입
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken())-1;
			b = Integer.parseInt(st.nextToken())-1;
			map[a][b] = 1;
			map[b][a] = 1;
			
		}
		for(int i = 0;i<n;i++) {
			//dfs 탐색 돌리기
			if(tmp == 0 && check[i] == false) {
				dfs(i,map,check);
				tmp ++;
			}
			
		}
		System.out.println(result);

	}
	static boolean[] dfs(int i, int[][] map, boolean[] check) {
		check[i] = true;
		for(int k = 0;k<map.length;k++) {
			if(i != k && check[k] == false && map[i][k] == 1) {
				check = dfs(k,map,check);
				result ++;
			}
		}
		return check;
	}

}
