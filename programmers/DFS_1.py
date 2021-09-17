#타겟넘버
def solution(numbers, target):
    answer = 0
    start = numbers[0] #타겟이랑 같아지는지 확인할 변수(현재값)
    answer = dfs(1,start,numbers, target)+dfs(1,-start,numbers, target)
    
    return answer
def dfs(index, start,numbers, target):
        if(index == len(numbers)):#돌만큼 다 돌았다
            if(start == target):
                return 1 #카운트+1(타겟이랑 맞춤)
            else:
                return 0 #카운트 x(조건에 맞지 않음)
        result = 0
        #다음 값을 더하고 빼는 각 경우의 수로 가지침
        result += dfs(index+1, start+numbers[index],numbers, target)
        result += dfs(index+1, start-numbers[index],numbers, target)
        return result
