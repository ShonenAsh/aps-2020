c = int(input())

for i in range(c):
    ctr = 0
    s = input().split(' ')
    n = s[0]
    b = int(s[1])
    if b != 2:
        print(len(bin(int(n, b))) - 2)
    else:
        print(len(n))
