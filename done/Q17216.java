import java.io.*;
import java.util.*;

public class Q17219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String,String> hm = new HashMap<String,String>();
		for(int i = 0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String site = st.nextToken();
			String pw = st.nextToken();
			hm.put(site, pw);
		}
		for(int i = 0;i<m;i++) {
			String search = br.readLine();
			bw.append(hm.get(search)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
