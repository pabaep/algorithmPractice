#연습문제 문자열 내 p와 y의 개수
def solution(s):
    answer = False
    if((s.count('p')+s.count('P'))==(s.count('y')+s.count('Y'))):
        answer = True

    return answer
