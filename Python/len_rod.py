n = int(input())

res = [0 for i in range(n)]

for i in range(2,n):
    for j in range(1,int(i/2)+1):
        res[i] = max(res[i],(j * (i-j)), res[i-j])

print(res)