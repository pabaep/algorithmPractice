#단어 변환

answer = 51

#최대로 가능한 가짓수+1에서 시작
def solution(begin, target, words):
    global answer
    
    dfs(begin, target, words, len(words))
    
    if(answer == 51): #밑의 if문에 걸리지 않아(타겟을 찾을 수 없어서) 그대로 50이면 0 리턴
        answer = 0
    
    return answer

def dfs(begin, target, words, length):
    global answer
    
    if(begin==target):
        if(answer > length-len(words)): #이전에 찾았던 값이 더 크면?
            answer = length-len(words) #현재의 최소 단계로 바꿔줌
            return
    #words 배열에 있는 모든 단어를 다 씀
    if(len(words)==0):
        return
    
    for word in words:
        count = 0
        '''
        지금 단어와 비교 대상들의 단어가 있을때
        지금 단어와 한글자만 차이나는 단어가 있으면 그 단어를 지금 단어로 해서 다시 DFS 돌림
        '''
        
        #같은 철자가 몇개 인지 카운트
        for i in range(len(word)):
            if begin[i]==word[i]: 
                count += 1
            
        if(count >= len(word)-1): #지금 단어와 한글자만 차이나면
            words.remove(word) #word 리스트에서 지우고(방문 처리)
            dfs(word, target, words, length) #DFS 새로 돌림
            words.append(word)
