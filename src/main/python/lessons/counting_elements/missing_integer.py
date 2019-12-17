import sys

'''
    https://codility.com/demo/results/demoE4F8ST-A8T/

'''


def solution(A):
    N = len(A) + 1
    C = [0 for _ in xrange(N)]

    for i in xrange(N - 1):
        if 1 <= A[i] <= N:
            C[A[i] - 1] = 1

    for i in xrange(N):
        if C[i] == 0:
            return i + 1

    return -1


def main(argv):
    print solution([1, 3, 6, 4, 1, 2])


if __name__ == "__main__":
    main(sys.argv[1:])
