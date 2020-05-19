n = int(input())
mat=[]
s=[]
flag = 0
id=[]
for i in range(n):
    s = input().split(' ')
    mat.append(s)

for i in range(1, n+1):
    flag = 0
    for j in range(1,n+1):
        if mat[j-1][i-1] != '-1':
            flag = 1
            break
    if flag == 0:
        id.append(i)

if len(id) == 0:
    print('-1')
for i in id:
    print(i)