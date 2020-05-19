t = int(input())
a = []

for i in range(t):
    s = input().split(' ')
    w = int(s[0])
    v = float(s[1])
    a.append((w, v/w))

c = int(input())

