def solution(lottos, win_nums):
    answer = []
    cnt = 7

    if 0 not in lottos:
        result = cntNums(cnt,lottos,win_nums)
        answer.append(result)
        answer.append(result)
    else:
        resultMin = cntNums(cnt,lottos,win_nums)
        zeroCnt = lottos.count(0)
        if zeroCnt == 6:
            resultMax = 1
        else:
            resultMax = resultMin-zeroCnt
        answer.append(resultMax)
        answer.append(resultMin)
    
    return answer
def cntNums(cnt,lottos,win_nums):
    for i in range(6):
        if lottos[i] in win_nums:
            cnt -= 1
    if cnt > 6:
        cnt = 6
    return cnt
