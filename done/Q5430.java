import java.util.*;
import java.io.*;

public class Q5430 {
	
	static Deque<String> dq = new LinkedList<>();
	static String p;
	static char[] pList;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<t;i++) {
			p = br.readLine();//연산 한줄 통째로
			pList = p.toCharArray();
			int n = Integer.parseInt(br.readLine());// 배열 숫자 개수
			String input = br.readLine();
            input = input.substring(1, input.length()-1);
            if(n != 0)
                st = new StringTokenizer(input, ",");
            else {
                // 배열에 주어진 수가 없는데 빼려하면 error
                // 빼려하지 않으면 "[]" 출력
                if(p.contains("D"))
                    sb.append("error\n");
                else
                	sb.append("[]\n");
                continue;
            }
            for(int j=0; j<n; j++)
                dq.add(st.nextToken()); 
            AC();
            
		}
		System.out.println(sb);
	}
	static void AC() {
		// true면 정방향 -> 앞에서 지움
        // false: 역방향 -> 뒤에서 지움
        boolean r = true;
        boolean errorFlag = false;
		for(int i=0; i<p.length(); i++) {
			if(pList[i] == 'R') {
				r = !r;
			}
			else {
                // 뺄게 없으면 오류
                if(dq.isEmpty()) {
                	errorFlag = true;
                    break;
                }
                // 정방향 이면 앞에서 빼기
                if(r) 
                    dq.pollFirst();
                else
                    dq.pollLast();    // 역방향이면 뒤에서 빼기
            }
		}
		 // 에러가 안났으면 남은 수 출력
        if(!errorFlag) {
        	sb.append("[");
            if(r) {
                while(dq.size() > 1)
                    sb.append(dq.pollFirst() + ",");
            }
            else {
                while(dq.size() > 1)
                	sb.append(dq.pollLast() + ",");
            }
            if(dq.size() != 0)
            	sb.append(dq.getFirst());
            sb.append("]\n");
        }
        else {
        	sb.append("error\n");
        }
        dq.clear();
    
	}

}
