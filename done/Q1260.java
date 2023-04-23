package done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260 {

	static int N, M;
    static ArrayList<Integer>[] nodeList;
    static boolean[] isVisted;
    
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String inputStr = br.readLine();
    	String array[] = inputStr.split(" ");
    	
        N = Integer.parseInt(array[0]);    // 정점 수
        M = Integer.parseInt(array[1]);    // 간선 수
        int V = Integer.parseInt(array[2]);    // 시작 정점

        nodeList = new ArrayList[N+1];    // 정점수대로 배열 생성
        isVisted = new boolean[N+1];         // 방문 여부를 판단

        // 간선 리스트 초기화
        // 1번 정점부터 리스트를 만들어서 배열에 넣기
        for (int i = 1; i <= N; i++) {
            nodeList[i] = new ArrayList<>();
        }

        // 간선수대로 반복하며 연결 리스트 생성
        for (int i = 0; i < M; i++) {
        	String edgeStr = br.readLine();
        	String edgeArray[] = edgeStr.split(" ");
            int from = Integer.parseInt(edgeArray[0]);
            int to = Integer.parseInt(edgeArray[1]);

            // 양방향
            nodeList[from].add(to);
            nodeList[to].add(from);
        }

        DFS(V);

        Arrays.fill(isVisted, false);
        sb.append("\n");

        BFS(V);

        System.out.print(sb);
    }

    private static void DFS(int V) {
        if(isVisted[V]) return;

        sb.append(V).append(" ");
        isVisted[V] = true;

        // 해당 노드에 존재하는 노드 수만큼 반복
        for (int i = 0; i < nodeList[V].size(); i++) {
            int MIN = 1001;

            // 해당 노드가 가장 낮은 수인지 모두 방문하여 검증
            for (int j = 0; j < nodeList[V].size(); j++) {
                int cur = nodeList[V].get(j);

                if(!isVisted[cur]) {
                    MIN = Math.min(MIN, cur);
                }
            }

            if(MIN == 1001) break;

            DFS(MIN);
        }
    }

    private static void BFS(int V) {
        Queue<Integer> q = new LinkedList<>();

        q.add(V);
        isVisted[V] = true;

        while(!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(" ");

            // 해당 노드에 존재하는 노드 수만큼 반복
            for (int i = 0; i < nodeList[node].size(); i++) {
                int MIN = 1001;

                // 해당 노드가 가장 낮은 수인지 모두 방문하여 검증
                for (int j = 0; j < nodeList[node].size(); j++) {
                    int cur = nodeList[node].get(j);

                    if(!isVisted[cur]) {
                        MIN = Math.min(MIN, cur);
                    }

                }

                if(MIN == 1001) break;

                q.add(MIN);
                isVisted[MIN] = true;
            }

        }

    }

}
