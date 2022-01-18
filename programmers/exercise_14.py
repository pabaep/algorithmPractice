#연습문제 최대공약수와 최소공배수
import math
def solution(n, m):
    answer = []
    answer.append(math.gcd(n,m)) #최대공약수
    #최소공배수_원래는 math 패키지에 있는데 3.9이상만 지원
    if n > m:
        n, m = m, n
    for i in range(m,(n*m)+1):
        if i%n==0 and i%m==0:
            answer.append(i)
            break
    return answer
