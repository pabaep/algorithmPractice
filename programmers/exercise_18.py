#연습문제 자연수 뒤집어 배열로 만들기

def solution(n):
    answer = list(map(int, list(str(n))))
    answer.reverse()
    return answer
#정렬해서 뒤집는게 아니라 그냥 뒤집는 것
#3125 -> 5213 이렇게
