for _ in range(int(input())):
    NP = list(map(int, input().split(' ')))
    N = NP[0]
    P = NP[1]
    D = list(map(int, input().split(' ')))
    temp = [0 for _ in range(N)]
    res = []
    flag = 0

    for i in D:
        if P % i != 0:
            flag = 1
            break

    if flag == 0:
        for i in range(N - 1):
            for j in range(i, N):
                if D[j] % D[i] != 0:
                    flag = 1
                    break

    if flag == 1:
        i = N - 1
        while i >= 0 and P > 0:
            if P % D[i] == 0:
                temp[i] = (P // D[i]) - 1
                P -= temp[i] * D[i]
            else:
                temp[i] = (P // D[i]) + 1
                P -= temp[i] * D[i]
            i -= 1

    if flag == 0:
        print('NO')
    else:
        print('YES ', end='')
        print(*temp)
