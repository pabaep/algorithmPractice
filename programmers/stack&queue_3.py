#다리를 지나는 트럭
def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = [0] * bridge_length ## 한계수용 만큼 다리에 자리를 만들어줌
    while len(bridge):
        answer += 1
        bridge.pop(0) #넣을거 가정하고 자리 하나 뺌
        if truck_weights:
            if(weight - sum(bridge) >= truck_weights[0]): #무게 조건 통과하면
                bridge.append(truck_weights.pop(0)) #트럭 하나 빼서 다리에 넣음
            else:
                bridge.append(0)#트럭 넣지 않았으므로 다시 0 넣음
    return answer
