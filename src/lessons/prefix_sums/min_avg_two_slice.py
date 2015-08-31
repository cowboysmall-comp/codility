import sys


'''
    https://codility.com/demo/results/demoKVKP3M-QCT/

'''


def solution(A):
    N = len(A)
    M = 10000
    I = 0

    for i in xrange(N - 1):
        C = (A[i] + A[i + 1]) / 2.0
        if M > C:
            M = C
            I = i

    for i in xrange(N - 2):
        C = (A[i] + A[i + 1] + A[i + 2]) / 3.0
        if M > C:
            M = C
            I = i

    return I


def main(argv):
    print solution([4, 2, 2, 5, 1, 5, 8])


if __name__ == "__main__":
    main(sys.argv[1:])
