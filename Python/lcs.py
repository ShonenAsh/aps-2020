s1 = input()
s2 = input()
lcs = [[0] * (len(s2)+1) for _ in range(len(s1)+1)]

for i in range(len(s1)+1):
    for j in range(len(s2)+1):
        if i == 0 or j == 0:
            lcs[i][j] = 0
        elif s1[i-1] == s2[j-1]:
            lcs[i][j] = lcs[i - 1][j - 1] + 1
        else:
            lcs[i][j] = max(lcs[i - 1][j], lcs[i][j-1])

x = lcs[len(s1)][len(s2)]
seq = [""] * (x+1)

i,j = len(s1), len(s2)

while i > 0 and j > 0:
    if s1[i-1] == s2[j-1]:
        seq[x-1] = s1[i-1]

        x -= 1
        i -= 1
        j -= 1
    elif lcs[i-1][j] > lcs[i][j-1]:
        i -= 1
    else:
        j -= 1

print("".join(seq))
print(lcs)