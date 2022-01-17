#연습문제 약수의 합
def solution(n):
    answer = 0
    for i in range(1,n+1):
        if n % i == 0: #약수 일때
            answer += i
    return answer
