#여행경로
answer = []

def solution(tickets):
    global answer

    dfs(tickets, 'ICN', ['ICN'])

    return answer

#가능한 모든 경로를 모두 뽑아내고 그중에서 알파벳 순서가 앞서는 경로를 return
def dfs (tickets, target, ans):
    global answer

    if len(tickets) == 0 : #티켓을 모두 썼을때
        #가능한 경로가 처음이거나, 이전 경로보다 알파벳으로 앞설때 answer로 추가
        if(len(answer) == 0 or ans < answer): 
            answer = list(ans)
        return

    ticketsC = list(tickets) #티켓 배열 그대로 복사, 티켓 배열에서 사용한 티켓을 빼려고 복사해둠

    for ticket in ticketsC: #ticket[0]:출발지, ticket[1]:도착지
        if ticket[0] == target :
            ans.append(ticket[1])
            tickets.remove(ticket)
            dfs(tickets, ticket[1], ans)
            ans.pop()
            tickets.append(ticket)
            
            
