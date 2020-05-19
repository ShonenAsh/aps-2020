import sys

MAX = sys.maxsize

n = 3
size = pow(2, n)
dp = [MAX for i in range(size)]
dp[0] = 0

cost = [[3, 2, 7],[5, 1, 3], [2, 7, 2]]


def ctr(num):
    bits = 0
    while num != 0:
        num &= num - 1
        bits += 1
    return bits


for mask in range(size):
    x = ctr(mask)
    for j in range(0, n):
        if mask & (1 << j) == 0:
            dp[mask | (1 << j)] = min(dp[mask | (1 << j)], dp[mask] + cost[x][j])

print(dp[size - 1])
