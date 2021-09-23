#전화번호 목록
def solution(phone_book):
    answer = True
    dic = {}
    #딕셔너리 키에 값(전화번호)를 저장하고 value에 인덱스를 부여
    for i in range(len(phone_book)):
        dic[phone_book[i]] = i
    for i in range(len(phone_book)):
        for j in range(1,len(phone_book[i])):
            if(phone_book[i][0:j] in dic):
                answer = False
    return answer
