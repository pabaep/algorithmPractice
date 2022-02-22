#dfs = stack
#bfs = queue
#재귀보다는 이렇게 구현하자

n, m, v = map(int, input().split())
#map은 리스트의 요소를 지정된 함수로 처리해줌/새 리스트를 만듬?
#n, m, v에 각각 처음 input을 split한 값을 순서대로 int 형태로 넣어줌
#map을 사용하면 한번에 형지정, 변수 할당이 가능함

#정석의 그래프 만드는 것은 아래와 같다(연결 리스트 만들기)

'''
#만약 n개만큼의 정점이 존재하고, m개만큼의 입력을 받는다면 
graph = [[] for _ in range(n+1)] # n+1개만큼의 공간을 만들어서 graph[n]이 n번 정점을 나타내도록 해 준다 
for _ in range(m):
	x,y = map(int,input().split()) #만약 1 2를 입력받으면 
    graph[x].append(y) # 1번 정점에 2를 넣어주고 -> graph[1] = [2] 
    graph[y].append(x) # 2번 정점에 1을 넣어준다 -> graph[2] = [1]
'''

#Graph set 중복 거르고 교집합 구하기 쉽게 set 사용(위 기본식에서 약간 변형)
graph_list = [set([]) for _ in range(n+1)]

for _ in range(m):
    i, j = map(int, input().split())
    graph_list[i].add(j)
    graph_list[j].add(i)

#DFS
def dfs(graph_list, start):
    visited = []
    stack = [start]

    while stack:
        node = stack.pop()
        if node not in visited:
            visited.append(node)
            stack += sorted(list(graph_list[node] - set(visited)), reverse = True)
            #스택은 뒤에서 나가니 역순 정렬
    return visited

#BFS
def bfs(graph_list, start):
    visited = []
    queue = [start]
    while queue:
        node = queue.pop(0)
        if node not in visited:
            visited.append(node)
            queue += sorted(list(graph_list[node] - set(visited)))
            #큐는 앞부터 나가니 순정렬
    return visited

for i in list(dfs(graph_list, v)):
    print(i, end=" ")
print()
for j in list(bfs(graph_list, v)):
    print(j, end=" ")
