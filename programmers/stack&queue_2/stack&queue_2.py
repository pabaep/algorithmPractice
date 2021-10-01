#프린터
def solution(priorities, location):
    answer = 1
    while priorities:
        if(location==0):
            if(priorities[0]<max(priorities)):
                priorities.append(priorities.pop(0))
                location = len(priorities)-1
            else:
                return answer
        else:
            if(priorities[0]<max(priorities)):
                priorities.append(priorities.pop(0))
                location -= 1
            else:
                priorities.pop(0)
                location -= 1
                answer += 1
