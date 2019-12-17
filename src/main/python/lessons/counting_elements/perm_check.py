import sys

'''
    https://codility.com/demo/results/demoCN2X25-6XN/

'''


def solution(A):
    N = len(A)
    C = [0 for _ in xrange(N)]

    for i in xrange(N):
        if 1 <= A[i] <= N:
            if C[A[i] - 1] == 1:
                return 0
            else:
                C[A[i] - 1] = 1
        else:
            return 0

    return 1


def main(argv):
    print solution([4, 1, 3, 2])
    print solution([4, 1, 3])


if __name__ == "__main__":
    main(sys.argv[1:])
