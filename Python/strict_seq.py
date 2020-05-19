n = int(input())

s = input().split(' ')

start = int(s[0])
maxlen = 0
templen = 0
for i in range(0, len(s)-1):
    if int(s[i]) == int(s[i+1])-1:
        templen += 1
    else:
        maxlen = templen
        templen = 0

print(maxlen)