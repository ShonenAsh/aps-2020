n = int(input())
s = input().split(' ')
k = int(input())
temp = s.copy()
s = list(set(s))
s.sort()


k_smallest = int(s[k-1])

k_larg_indx = temp.index(s[-k])

for i in range(k_smallest):
    p = temp.pop()
    temp.insert(k_larg_indx, p)

for i in temp:
    print(i, end=' ')