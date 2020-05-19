from itertools import permutations as prm

# number of movies/show-timings
n = 4
T_MAP = ['12', '3', '6', '9']
M_MAP = ['A', 'B', 'C', 'D']
prices = [100, 75, 50, 25]
P = [i for i in prm([0, 1, 2, 3]) if len(set(i)) == n]
res = 0
for tc in range(int(input())):
    S = []
    req = [[0, 0, 0, 0] for i in range(n)]
    N = int(input())
    for i in range(N):
        MT = list(map(str, input().split(' ')))
        M = MT[0]
        T = MT[1]
        req[M_MAP.index(M)][T_MAP.index(T)] += 1

    for m in P:
        for t in P:
            temp = []
            for a, b in zip(m, t):
                temp.append(req[a][b])
                temp = sorted(temp, reverse=True)
            # calculating sum
            s = 0
            for a, b in zip(temp, prices):
                if a > 0:
                    s = s + (a * b)
                else:
                    s = s - 100
            S.append(s)

    print(max(S))
    res += max(S)
print(res)
