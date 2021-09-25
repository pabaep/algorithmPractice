#기능개발
import math
def solution(progresses, speeds):
    answer = []
    queue = []
    for i in range(len(progresses)):
        value = math.ceil((100-progresses[i])/speeds[i]) //올림
        queue.append(value)
        print(value)
    start = queue[0]
    tmp = 0    
    for i in range(len(progresses)):
        if(queue[i]<=start):
            tmp += 1
        else:
            answer.append(tmp)
            start = queue[i]
            tmp = 1
    answer.append(tmp)    
            
        
    return answer
