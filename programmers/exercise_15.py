#연습문제 정수 제곱근 판별
import math
def solution(n):
    answer = 0
    num = math.sqrt(n)
    if (num*10) % 10 == 0:
        answer = math.pow(num+1,2)
    else:
        answer = -1
    return answer
