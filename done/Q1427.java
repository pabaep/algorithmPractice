import java.io.*;
import java.util.*;

public class Q1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] list;
		list = s.split("");
		Arrays.sort(list,Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<list.length;i++) {
			sb.append(list[i]);
		}
		sb.append("\n");
		System.out.println(sb);

	}

}
