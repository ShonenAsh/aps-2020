for _ in range(int(input())):
    NK = list(map(int, input().split(' ')))
    N = NK[0]
    K = NK[1]
    # Ai (Coins in each bag)
    A = list(map(int, input().split(' ')))
    leftovers = sum(A)%K
    print(leftovers)
