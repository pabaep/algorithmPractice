#완전탐색 모의고사
def solution(answers):
    answer = []
    a1 = [1,2,3,4,5]
    a2 = [2, 1, 2, 3, 2, 4, 2, 5]
    a3 = [ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt1,cnt2,cnt3 = 0,0,0
    for i in range(len(answers)):
        ia1 = i%5
        ia2 = i%8
        ia3 = i%10
        if a1[ia1] == answers[i]:
            cnt1 += 1
        if a2[ia2] == answers[i]:
            cnt2 += 1
        if a3[ia3] == answers[i]:
            cnt3 += 1
    maxCnt = max(cnt1,cnt2,cnt3)
    if maxCnt == cnt1:
        answer.append(1)
    if maxCnt == cnt2:
        answer.append(2)
    if maxCnt == cnt3:
        answer.append(3)
    return answer
