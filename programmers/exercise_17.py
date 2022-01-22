#연습문제 정수 내림차순으로 배치하기
def solution(n):
    answer = 0
    nList = list(str(n))
    nList.sort(reverse=True)
    answer = int("".join(nList))
    return answer
