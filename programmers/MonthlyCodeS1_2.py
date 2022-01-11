#월간코드 챌린지 시즌 1 3진법 뒤집기
def solution(n):
    answer = 0
    quotient = int(n/3)
    result = str(n%3)
    
    if(quotient>=3):
        while(quotient>=3):
            result += str(quotient % 3) 
            quotient = int(quotient/3)
        result += str(quotient)
    
        
    for i in range(len(result)):
        answer += int(result[i])*(3**(len(result)-1-i))
    
    return answer
