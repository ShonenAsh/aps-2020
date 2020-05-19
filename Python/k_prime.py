def SOE(a, pS, pr, n):
    for i in range(2, n + 1):
        pr[i] = True

    for i in range((n * n + 1) + 1):
        pS[i] = False
    pr[1] = False
    x = a
    p = 2
    while p * p <= n:
        if pr[p]:
            # Update all multiples of p
            i = p * 2
            while i <= n:
                pr[i] = False
                i += p
        p += 1

    j = 0
    for p in range(2, n + 1):
        if pr[p]:
            a[j] = p
            pS[p * p] = True
            j += 1


def divisors(X, K):
    pr = [False] * (X + 2)
    primeS = [False] * (X * X + 2)
    a = [0] * X

    if X == 1:
        return 1
    SOE(a, primeS, pr, X)
    ans = 1
    i = 0
    while True:
        if a[i] * a[i] * a[i] > X:
            break
        ctr = 1
        while X % a[i] == 0:
            X = X / a[i]
            ctr = ctr + 1
        ans = ans * ctr
        i += 1
    X = int(X)

    if pr[X]:
        ans = ans * 2
    elif primeS[X]:
        ans = ans * 3
    elif X != 1:
        ans = ans * 4

    if ans >= K:
        print("1")
    else:
        print("0")


for i in range(int(input())):
    inp = list(map(int, input().split()))
    X = inp[0]
    K = inp[1]
    divisors(X, K)
