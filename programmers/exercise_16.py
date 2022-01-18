#연습문제 문자열 다루기 기본
def solution(s):
    answer = False
    if len(s) == 4 or len(s) == 6:
        if s.isdigit(): 
            answer = True
    return answer

    '''
    문자열.isdigit() : 문자열이 숫자의 형태이면 True_지수 가능
    문자열.isnumeric() : 문자열이 숫자값에 해당하는 문자열이면 True_분수, 지수 가능
    문자열.isdecimal() : 문자열이 int형으로 변환 가능하면 True
    '''
