import sys

'''
    https://codility.com/demo/results/demoV955CP-443/

'''


def solution(A):
    N = len(A) + 1
    T = N * (N + 1) // 2

    for a in A:
        T -= a

    return T


def main(argv):
    print solution([2, 3, 1, 5])


if __name__ == "__main__":
    main(sys.argv[1:])
