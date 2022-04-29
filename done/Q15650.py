from itertools import combinations 

N, M = map(int, input().split())

p = combinations(range(1, N+1), M)

for i in p: 
  print(*i) # Unpacking (*)
