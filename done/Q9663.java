import java.util.*;

public class Q9663 {
	static int count = 0;// 최종적으로 프린트 할 count
	static int[] a;// 체스판의 세로(열)가 a[i]=j의 i이고 가로가 j이다
    public static boolean isPromising(int[] q, int k) {// 유망한지 확인
        for (int i = 0; i < k; i++) {
            if (q[i] == q[k]) return false;   // 같은 열인지
            if ((q[i] - q[k]) == (k - i)) return false;   // '\' 방향
            if ((q[k] - q[i]) == (k - i)) return false;   // '/' 방향
        }
        return true;
    }

    public static void enumerate(int[] q, int k) {// 맞는 경우의 수 체크
        int N = q.length;
        // n이 끝까지 돌았다면 카운트를 증가한다.
        if (k == N) {
            count++;
        } else {
            for (int i = 0; i < N; i++) {
                q[k] = i;
                // 유망하다면 계속 탐색(재귀호출), 유망하지 않다면 거기서 종료?
                if (isPromising(q, k)) {
                	enumerate(q, k + 1); //k+1을 하므로서 가로를 0,1,...,n-1까지 증가시킴
                	
                }
            }
        }
    }
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	a = new int[n];
        enumerate(a , 0);//a[0]자리 부터 탐색해야 하므로 초기에는 0을 넣음, 초기 k가 0인셈
        System.out.println(count);
    }

}
