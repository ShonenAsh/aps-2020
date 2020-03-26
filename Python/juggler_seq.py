from math import *

def Juggler(n):
    a = n
    # First term
    print(a)
    while a != 1:
        b = 0
        if a % 2 == 0:
            b = int(floor(sqrt(a)))
        else:
            b = int(floor(sqrt(a) * sqrt(a) * sqrt(a)))
        print(b)
        a = b


if __name__ == '__main__':
    # Accepts n for generating the Juggler's sequence
    Juggler(int(input()))
