import numpy as np
for _ in range(int(input())):
    n = int(input())
    # A = list(map(int, input().split(' ')))
    graph = [[0,0,0] for _ in range(n)]
    for i in range(n):
        graph[i] = list(map(int, input().split(' ')))

    stk = []
    for i in range(n):
        stk.append(graph[:][1].index(i+1)+1)
    k = n+1
    ctr = n
    while True:
        p = stk.pop()
        if ctr == 0:
            print(1)
            break
        if p == -1:
            print(0)
            break
        if k != graph[graph[:][0].index(p)][2]:
            print(0)
            break
