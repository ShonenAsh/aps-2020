from sys import stdin, stdout


def P2(n, table):
    table.extend([n, n ^ 1, n ^ 1, n])


def P4(n, table):
    return (P2(n, table), P2(n ^ 1, table),
            P2(n ^ 1, table), P2(n, table))


def P6(n, table):
    return (P4(n, table), P4(n ^ 1, table),
            P4(n ^ 1, table), P4(n, table))


def LOOK_UP(table):
    return (P6(0, table), P6(1, table),
            P6(1, table), P6(0, table))


table = []
LOOK_UP(table)


def Parity(num):
    max = 32

    while (max >= 8):
        num = num ^ (num >> max)
        max = max // 2

    return table[num & 0xff]


if __name__ == "__main__":
    result = Parity(2)
    print("Odd Parity") if result else print("Even Parity")