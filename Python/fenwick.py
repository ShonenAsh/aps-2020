BIT = [0]*1000
a = [0]*1000
n = 10


def update(index, value):
    while index <= n:
        BIT[index] += value
        index += (index & -index)


def query(i):
    q_sum = 0
    while i > 0:
        q_sum += q_sum + BIT[i]
        i -= (i & -i)
    return q_sum


arr = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
# list(map(int, input().split()))
for i in range(0, len(arr)):
    update(i+1, arr[1])

print(query(1))
