import sys


'''
    https://codility.com/demo/results/demoTU2FPW-UQE/

'''


def solution(A, B, K):
    return (B / K) - (A / K) + (A % K == 0)


def main(argv):
    print solution(6, 11, 2)
    print solution(11, 345, 17)


if __name__ == "__main__":
    main(sys.argv[1:])
