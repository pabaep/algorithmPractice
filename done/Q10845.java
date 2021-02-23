//Q18258
import java.io.*;
import java.util.*;

public class Q10845 {
	static Queue<Integer> q = new LinkedList<>();
	static int n;
	static int last;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		String str = null;
		String input = null;
		
		for(int i = 0 ; i<n ; i++) {
			str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            input = st.nextToken();
            switch(input){
			case "push": Push(Integer.parseInt(st.nextToken())); break;
			case "pop" : Pop(); break;
			case "size" : Size(); break;
			case "empty" : Empty(); break;
			case "front" : Front(); break;
			case "back" : Back(); break;
			}
		}
		bw.flush();
		bw.close();
        br.close();
	}
	static void Push(int x) {
		q.add(x);
		last = x;
	}
	static void Pop() throws IOException {
		if(q.isEmpty()) {
			bw.write(-1+"\n");
		}
		else {
			bw.write(q.poll()+"\n");
		}
	}
	static void Size() throws IOException {
		bw.write(q.size()+"\n");
	}
	static void Empty() throws IOException {
		if(q.isEmpty()) {
			bw.write(1+"\n");
		}
		else {
			bw.write(0+"\n");
		}
	}
	static void Front() throws IOException {
		if(q.isEmpty()) {
			bw.write(-1+"\n");
		}
		else {
			bw.write(q.peek()+"\n");
		}
	}
	static void Back() throws IOException {
		if(q.isEmpty()) {
			bw.write(-1+"\n");
		}
		else {
			bw.write(last+"\n");
		}
	}
}
