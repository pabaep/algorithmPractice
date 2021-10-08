#가장 먼 노드
from collections import deque

def bfs(v, visited, adj):
    cnt = 0
    q = deque([[v,cnt]]) #노드별 카운트를 같이 저장
    while q:
        value = q.popleft()
        v = value[0] #노드
        cnt = value[1] #카운트
        if visited[v] == -1: #방문 안했으면
            visited[v] = cnt #카운트 저장
            cnt += 1 #다음 깊이?로 가야 해서 증가
            for e in adj[v]:
                q.append([e,cnt]) #다음 탐색할 것 큐에 저장

def solution(n, edge):
    answer = 0
    visited = [-1] * (n+1)
    adj = [[] for _ in range(n+1)]
    #공간 만들어서 입력에 따라 그래프를 표현해줌
    for e in edge:
        x = e[0]
        y = e[1]
        adj[x].append(y)
        adj[y].append(x)
    
    bfs(1,visited,adj)
    for value in visited:
        if value == max(visited):
            answer += 1
    return answer
