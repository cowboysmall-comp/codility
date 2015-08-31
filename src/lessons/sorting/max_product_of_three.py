import sys


'''
    https://codility.com/demo/results/demo2VJYVU-QCK/

'''


def solution(A):
    A.sort()
    return max(A[-1] * A[-2] * A[-3], A[-1] * A[0] * A[1])


def main(argv):
    print solution([-3, 1, 2, -2, 5, 6])
    print solution([-5, 5, -5, 4])


if __name__ == "__main__":
    main(sys.argv[1:])
