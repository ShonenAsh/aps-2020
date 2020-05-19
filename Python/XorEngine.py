from sys import stdin, stdout


def par_check(n):
    n = bin(int(n)).count('1')
    return n % 2


if __name__ == '__main__':
    for _ in range(int(input())):
        N, Q = map(int, input().split())
        A = list(map(par_check, stdin.readline().split()))
        ctrE = A.count(0)
        ctrO = A.count(1)
        for _ in range(Q):
            P = int(input())
            if par_check(P) == 0:
                stdout.write("%d %d\n" % (ctrE, ctrO))
            else:
                stdout.write("%d %d\n" % (ctrO, ctrE))
