#연습문제 같은 숫자는 싫어
def solution(arr):
    answer = []
    tmp = arr[0]
    answer.append(tmp)
    for i in range(1,len(arr)):
        if tmp != arr[i]:
            answer.append(arr[i])
        tmp = arr[i]
    return answer
'''
tmp에 이전 숫자 저장(초기 숫자도 정답배열에 저장)
tmp와 지금 숫자가 같지 않다면 리스트에 저장 -> tmp를 지금 숫자로 바꿈
같다면 리스트에 저장 x ->tmp를 지금 숫자로 바꿈
'''
