import sys

'''
    https://codility.com/demo/results/demoH9AHHN-JAV/

'''


def solution(A):
    L = A[0]
    R = sum(A[1:])

    M = abs(R - L)

    for i in xrange(1, len(A)):
        L += A[i]
        R -= A[i]
        D  = abs(R - L)
        if M > D:
            M = D

    return M


def main(argv):
    print solution([3, 1, 2, 4, 3])


if __name__ == "__main__":
    main(sys.argv[1:])
