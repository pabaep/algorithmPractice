import java.io.*;
import java.util.*;

public class Q1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xMin = Math.min(x, w-x);	// x축 최소거리
		int yMin = Math.min(y, h-y);	// y축 최소거리
        
		
		int min = Math.min(xMin, yMin);
		
		System.out.println(min);
	}

}
