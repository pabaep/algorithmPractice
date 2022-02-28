import sys

num1 = int(sys.stdin.readline())
num2 = int(sys.stdin.readline())
graph = [[]*num1 for _ in range(num1+1)] # 경로를 저장하기 위한 2차원 리스트
for _ in range(num2):
    a,b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

cnt = 0
visited = [0]*(num1+1) # 방문하지 않으면 0, 방문했으면 1

def dfs(start):
    visited[start] = 1
    global cnt
    for i in graph[start]:
        if visited[i]==0:
            dfs(i)
            cnt += 1
dfs(1)
print(cnt)
