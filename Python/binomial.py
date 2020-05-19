n = 8
k = 4


def get_binomial(n, k):
    c = [[0 for _ in range(k + 1)] for __ in range(n + 1)]
    for i in range(0, n + 1):
        for j in range(0, min(i, k) + 1):
            if j == 0 or i == j:
                c[i][j] = 1
            else:
                c[i][j] = c[i - 1][j - 1]

    return (c[n][k])


# recursive
def recBC(n, k):
    if n == k or k == 0:
        return 1
    return recBC(n - 1, k - 1) + recBC(n - k, k)


print(recBC(n, k))
