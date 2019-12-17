import sys


'''
    https://codility.com/demo/results/demoB22535-P8R/

'''


def solution(A):
    L = 0
    R = sum(A)

    for i in xrange(len(A)):
        R -= A[i]

        if L == R:
            return i

        L += A[i]

    return -1


def main(argv):
    print solution([-1, 3, -4, 5, 1, -6, 2, 1])


if __name__ == "__main__":
    main(sys.argv[1:])
