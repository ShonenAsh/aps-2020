import sys

arr = list(map(int, input().split(' ')))
for _ in range(2):
    st = 0
    s = 0
    end = 0
    max_val = -sys.maxsize -1
    t_max = 0
    for i in range(0, len(arr)):
        t_max += arr[i]
        if max_val < t_max:
            max_val = t_max
            st = s
            end = i
        if t_max < 0:
            t_max = 0
            s = i + 1
    if max_val >= 0:
        print(max_val)
    else:
        break
    sub = arr[st:end+1]
    # print("sub = " + str(sub))
    for x in sub:
        arr.remove(x)

