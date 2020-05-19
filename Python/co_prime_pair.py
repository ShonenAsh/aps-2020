def gcd(a, b):
    # Everything divides 0
    if (a == 0 or b == 0):
        False

    # base case
    if (a == b):
        return a

    # a is greater
    if (a > b):
        return gcd(a - b, b)

    return gcd(a, b - a)


def coprime(a, b):
    return (gcd(a, b) == 1)


def numOfPairs(arr, n):
    count = 0

    for i in range(0, n - 1):
        for j in range(i + 1, n):

            if (coprime(arr[i], arr[j])):
                count = count + 1

    return count


arr = [1, 2, 3, 4, 5, 6, 7]
n = len(arr)

print(numOfPairs(arr, n))
