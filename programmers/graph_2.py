#순위
def solution(n, results):
    matrix = [[None for _ in range(n)]for _ in range(n)]
    #연결 x = None ,진쪽 = False, 이긴쪽 = True
    for win, lose in results:
        matrix[win-1][lose-1] = True
        matrix[lose-1][win-1] = False
    #플로이드-워셜 알고리즘 j -> i -> k
    for i in range(n):
        for j in range(n):
            for k in range(n):
                if matrix[j][i] == None: #연결 안되면 pass
                    continue
                if matrix[j][i] == matrix[i][k]:#상태 같으면
                    matrix[j][k] = matrix[j][i]
                    matrix[k][j] = not matrix[j][i] #!==not
    answer = 0
    #연결이 다 되지 않은?(간접비교조차 안된) 노드는 Node이 2개 이상
    #자기자신이 None이라 이거 빼고 있는지 확인
    for i in range(n):
        if None in matrix[i][:i]+matrix[i][i+1:]:
            continue #None이 없는 것만 카운트 하려고
        answer += 1
    return answer
