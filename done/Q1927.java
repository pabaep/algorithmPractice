import java.io.*;
import java.util.*;

public class Q1927 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int tmp;
		for(int i = 0; i<n ; i++) {
			tmp = Integer.parseInt(br.readLine());
			if(tmp == 0) {
				if(pq.isEmpty() == false){
					sb.append(pq.poll()+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			else {
				pq.add(tmp);
			}
		}
		System.out.println(sb.toString());
		
	}

}
