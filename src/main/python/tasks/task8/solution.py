import sys

'''
    https://app.codility.com/c/feedback/NDJ749-X8Y/
'''

def solution(A, B):
    AA = str(A)
    BB = str(B)

    c  = min(len(AA), len(BB))

    ZZ  = ''

    for i in range(c):
        ZZ += AA[i] + BB[i]

    ZZ += AA[c:] + BB[c:]

    Z  = int(ZZ)

    return -1 if Z > 100000000 else Z



def main(argv):
    print(solution(12, 56))
    print()

    print(solution(12345, 678))
    print()

    print(solution(1234, 0))
    print()


if __name__ == "__main__":
    main(sys.argv[1:])
