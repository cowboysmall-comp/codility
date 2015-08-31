import sys

'''
    https://codility.com/demo/results/demoEX8TH7-3EU/

'''


def solution(X, A):
    C = [-1 for _ in xrange(X)]

    for i in xrange(len(A)):
        if C[A[i] - 1] == -1:
            C[A[i] - 1] = i
            X -= 1
            if X == 0:
                return i

    return -1


def main(argv):
    print solution(5, [1, 3, 1, 4, 2, 3, 5, 4])


if __name__ == "__main__":
    main(sys.argv[1:])
