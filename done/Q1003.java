/*버퍼가 스태너 보다 빠르다....*/
import java.io.*;

public class Q1003 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(r.readLine());
		int [][] fibo = new int[41][2];
		fibo[0][0] = 1;
		fibo[1][1] = 1;
		for (int i = 2;i < 41;i++) {
			for(int j = 0;j<2;j++) {
				fibo[i][j] = fibo[i-1][j]+fibo[i-2][j];
			}
		}
		for(int i = 0;i<t;i++) {
			int n = Integer.parseInt(r.readLine());
			w.write(fibo[n][0]+" "+fibo[n][1]+"\n");
		}
		r.close();
		w.close();
	}

}
