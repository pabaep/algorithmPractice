#주식가격
from collections import deque
def solution(prices):
    answer = []
    dq = deque(prices)
    while dq:
        cnt = 0
        tmp = dq.popleft()
        for i in dq:
            cnt += 1
            if tmp > i:
                break
        answer.append(cnt)
    return answer
