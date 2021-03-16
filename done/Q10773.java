import java.util.*;

public class Q10773 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int k = s.nextInt();
		int sum = 0;
		for(int i = 0;i<k;i++) {
			int tmp = s.nextInt();
			if(tmp != 0) {
				st.push(tmp);
			}
			else {
				st.pop();
			}
			
		}
		while(!st.empty()) {
			sum += st.pop();
		}
		System.out.println(sum);
	}

}
