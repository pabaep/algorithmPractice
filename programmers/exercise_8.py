#연습문제 x만큼 간격이 있는 n개의 숫자
def solution(x, n):
    answer = []
    a = 1
    if x == 0:
        for i in range(n):
            answer.append(0)
        return answer
    if x<0:
        a = -1
    for i in range(x,n*x+a,x):
        answer.append(i)
    return answer
