#위장
def solution(clothes):
    answer = 1
    dic = {}
    for i in range(len(clothes)):
        if(clothes[i][1] in dic):
            tmp = dic.get(clothes[i][1])
            tmp += 1
            dic[clothes[i][1]] = tmp
        else:
            dic[clothes[i][1]] = 1
    dVal = dic.values()
    
    for i in dVal:
        answer *= i+1
        
    return answer-1
