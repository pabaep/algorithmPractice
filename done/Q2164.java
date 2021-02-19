import java.util.*;

public class Q2164 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 1;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1;i<n+1;i++) {
			q.add(i); // 큐에 값 집어넣기
		}
		while(true) {
			if(q.isEmpty()) break;
			else {
				result = q.element();
				q.remove();
			}
			if(q.isEmpty()) break;
			else {
				q.add(q.poll());
			}
		}
		System.out.println(result);
	}

}
