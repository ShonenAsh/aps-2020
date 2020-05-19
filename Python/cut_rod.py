n = int(input())
arr = list(map(int, input().split(' ')))
MIN = -1
res = [0 for _ in range(n+1)]

for i in range(1, n+1):
    m = MIN
    for j in range(i):
        m = max(m, arr[j] + res[i - j -1])
    res[i] = m

print(res[n])