import sys

def fact(n):
    array = []
    tmp = 1
    for i in range(1,n+1):
        tmp *= i
        array.append(tmp)
    return array

while(True):
    n = int(sys.stdin.readline())
    if n==0:
        break
    nLen = len(str(n))
    factArray = fact(nLen)
    nArray = list(map(int,list(str(n))))
    result = 0  
    for i in range(nLen): 
        result += nArray[i]*factArray[nLen-1-i]
    print(result)
