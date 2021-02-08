import java.util.*;
import java.io.*;

public class Q2776 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		/*입력*/
		int t = Integer.parseInt(br.readLine());
		for(int i = 0;i<t;i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                map.put(Integer.parseInt(st.nextToken()), true);
			}
			int m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                if(map.containsKey(Integer.parseInt(st.nextToken()))){
                    bw.write("1\n");
                }else {
                    bw.write("0\n");
                }
            }
		}
		bw.flush();
        br.close();
        bw.close();

	}

}
