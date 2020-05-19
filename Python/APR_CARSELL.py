for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort(reverse=True)
    p_sum = 0
    for i in range(n):
        if arr[i] >= i:
            arr[i] -= i
        else:
            arr[i] = 0
        p_sum += arr[i] % 1000000007

    print(p_sum)