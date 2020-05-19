# matrix of preferences
mat = []
n = int(input())
# populate all free men
free_men = [i for i in range(1, n+1)]

for i in range(n):
    pref_man = list(map(int, input().split(' ')))
    for j in pref_man:
        mat.append(j)

ids = set(free_men).difference(set(mat))

if len(ids) == 0:
    # No man is free
    print(-1)
for i in ids:
    print(i)
