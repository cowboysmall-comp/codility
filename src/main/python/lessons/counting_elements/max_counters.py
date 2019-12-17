import sys

'''
    https://codility.com/demo/results/demoCNH4M5-SPQ/

'''


def solution(N, A):
    C = [0 for _ in xrange(N)]
    L = 0
    M = 0

    for a in A:
        if 1 <= a <= N:
            C[a - 1] = max(L, C[a - 1]) + 1
            M = max(M, C[a - 1])
        else:
            L = M

    for i in xrange(N):
        C[i] = max(L, C[i])

    return C


def main(argv):
    print solution(5, [3, 4, 4, 6, 1, 4, 4])


if __name__ == "__main__":
    main(sys.argv[1:])
