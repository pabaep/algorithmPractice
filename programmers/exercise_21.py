#연습문제 하샤드 수
def solution(x):
    answer = False
    s = str(x)
    sum = 0
    for i in range(len(s)):
        sum += int(s[i])
    if(x % sum) == 0:
        answer = True
    return answer
