n = int(input())
men = []
s = []

id = []
for i in range(n):
    s = input().split(' ')
    men.append(s)

women_t = []
for i in range(n):
    s = input().split(' ')
    women_t.append(s)
# transpose of woman's
women = [[women_t[j][i] for j in range(len(women_t))] for i in range(len(women_t[0]))]

q = int(input())
for i in range(q):
    id.append(int(input()))


def prefer_to(w, m, m1):
    if women[w][m1] < women[w][m]:
        return True
    else:
        return False


free_men = [i for i in range(n)]

# index is the woman's id-1
pair_res = [-1 for i in range(n)]
# prop counter for each woman
prop_ctr = [0 for i in range(n)]
proposals =[[-1 for i in range(n)] for j in range(n)]
temp = 0
while len(free_men) > 0:
    for j in range(1, n + 1):
        w = men[free_men[0]].index(str(j))
        if proposals[free_men[0]][w] > -1:
            continue
        # freeman proposes w
        prop_ctr[w] += 1
        proposals[free_men[0]][w] += 1
        if pair_res[w] == -1:
            pair_res[w] = free_men[0]
            free_men.pop(0)
            break
        elif prefer_to(w, pair_res[w], free_men[0]):
            temp = pair_res[w]
            pair_res[w] = free_men[0]
            free_men.pop(0)
            free_men.append(temp)
            break

for i in id:
    print(prop_ctr[i-1])