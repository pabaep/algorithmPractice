import java.util.*;
import java.io.*;

public class Q10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [][] list = new String [n][2];
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}
		Arrays.sort(list, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n;i++) {
			sb.append(list[i][0]+" ");
			sb.append(list[i][1]+"\n");
		}
		System.out.println(sb);
	}

}
