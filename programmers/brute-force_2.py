#완전탐색 소수 찾기
import math
from itertools import permutations
def solution(numbers):
    answer = 0
    p = []
    result = []
    
    for i in range(1, len(numbers)+1):
        p.extend(permutations(numbers, i)) #permutations 순열
        result = [int(''.join(i)) for i in p]
        #int(''.join(i)) 정수 변환 부분, 011 -> 11
    
    for i in set(result):
        if isPrime(i):
            answer+=1

    return answer

# 소수 판별 함수
def isPrime(n):
    if n < 2:
        return False
    
    for i in range(2, n//2+1):
        if n%i == 0:
            return False
        
    return True 
