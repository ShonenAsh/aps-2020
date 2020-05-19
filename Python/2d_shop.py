import sys
NM = list(map(int, input().split(' ')))
N = NM[0]
M = NM[1]
mat = []
for i in range(N):
    arr = list(map(int, input().split(' ')))
    mat.append(arr)

def max2dsum(arr, st, fin):
    _sum = 0
    maxSum = - sys.maxsize

