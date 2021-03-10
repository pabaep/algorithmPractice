import java.util.*;
import java.io.*;

public class Q1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] nList = new int [n][2]; //[][0]: 시작시간, [][1]: 종료시간;
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nList[i][0] = Integer.parseInt(st.nextToken());
			nList[i][1] = Integer.parseInt(st.nextToken());
			
		}
		//sort 재정의
		Arrays.sort(nList, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//종료시간이 같을 경우 시작시간이 빠른 순서로 정렬
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
			
		});
		int cnt = 0;//==result
		int time = 0;//직전 종료 시간
		for(int i = 0;i<n;i++) {
			if(time <= nList[i][0]) {
				time = nList[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
