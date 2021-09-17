#네트워크
def solution(n, computers):
    #인접행렬 + dfs
    answer = 0
    visited = [0]*n; #n개의 0값을 가지는 리스트 만들기
    
    '''
    i번째 노드를 방문하지 않았다면, 스택에 i번째 노드를 넣는다.
    stack의 요소를 하나씩 pop해서 visited 배열에 해당 노드를 true 처리한다.
    해당 노드와 연결된 노드들 중 방문하지 않은 노드들을 스택에 넣어준다.
    
    위 3가지를 n개의 노드에 대해 반복한다.
    '''
    
    def dfs(n,computers, visited, start):
        stack = [start]
        while stack:
            j = stack.pop()
            if visited[j] == 0: #방문하지 않았다면
                visited[j] = 1 #방문 체크
            for i in range(n):
                if computers[j][i] == 1 and visited[i] == 0:
                    #해당 노드와 연결되어있고, 방문하지 않은 노드를 stack에 추가
                    stack.append(i)
    for i in range(n):
        if not visited[i]:
            dfs(n, computers, visited, i)
            answer += 1
    return answer
