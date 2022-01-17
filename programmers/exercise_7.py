#연습문제 가운데 글자 가져오기
def solution(s):
    answer = ''
    length = len(s)
    if length % 2 == 0: #짝수라면
        answer = s[(length//2)-1]+s[length//2]
    else: #홀수라면
        answer = s[length//2]
    return answer
