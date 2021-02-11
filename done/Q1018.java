import java.io.*;
import java.util.*;

public class Q1018 {
	public static int min = 64;
	public static boolean [][] chess;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken()); 
		
		chess = new boolean[n][m];
		
		for(int i = 0;i<n;i++) {
			String tmp = br.readLine();
			
			for(int j = 0;j<m;j++) {
				if(tmp.charAt(j)=='w') {
					chess[i][j] = true;
				}
				else {
					chess[i][j] = false;
				}
			}
		}
		int N_row = n - 7;
		int M_col = m - 7;
		
		for(int i = 0;i<N_row;i++) {
			for(int j = 0;j<M_col;j++) {
				chessResult(i,j);
			}
		}
		System.out.println(min);
	}
	static void chessResult(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;
		boolean start= chess[x][y];
		
		for(int i = x;i<end_x;i++) {
			for(int j = y;j<end_y;j++) {
				if(chess[i][j] != start) {
					cnt++;
				}
				start = !start;
			}
			start = !start;
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
}
