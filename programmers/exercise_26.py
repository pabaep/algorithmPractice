#연습문제 소수 찾기
import math

def is_prime_num(n):
    arr = [True] * (n + 1)

    for i in range(2, int(math.sqrt(n)+1)):
        if arr[i] == True:
            j = 2

            while (i * j) <= n:
                arr[i*j] = False
                j += 1

    return arr

def solution(n):
    answer = 0
    
    arr = is_prime_num(n)

    for i in range(len(arr)):
        if arr[i] == True:
            answer += 1
    return answer-2
