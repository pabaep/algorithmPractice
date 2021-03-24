import java.io.*;
import java.util.*;

public class Q10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> dq = new ArrayDeque<>();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			if(a.equals("push_front")) {
				dq.addFirst(st.nextToken());
			}
			else if(a.equals("push_back")) {
				dq.addLast(st.nextToken());
			}
			else if(a.equals("pop_front")){
				System.out.println(dq.isEmpty()?-1:dq.pop());
			}
			else if(a.equals("pop_back")){
				System.out.println(dq.isEmpty()?-1:dq.removeLast());		
			}
			else if(a.equals("size")){
				System.out.println(dq.size());
			}
			else if(a.equals("empty")){
				System.out.println(dq.isEmpty()?1:0);
			}
			else if(a.equals("front")){
				System.out.println(dq.isEmpty()?-1:dq.peek());
			}
			else if(a.equals("back")){
				System.out.println(dq.isEmpty()?-1:dq.peekLast());
			}
		}

	}

}
