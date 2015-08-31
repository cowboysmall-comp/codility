import sys


'''
    https://codility.com/demo/results

'''


def prefix_sums(A):
    N = len(A)
    P = [0 for _ in xrange(N + 1)]

    for i in xrange(1, N + 1):
        P[i] = P[i - 1] + A[i - 1]

    return P


def count_totals(P, x, y):
    return P[y + 1] - P[x]


def solution(A, K, M):
    N = len(A)
    R = 0
    P = prefix_sums(A)

    for i in xrange(min(K, M) + 1):
        l = K - i
        r = min(K + (M - 2 * i), N - 1)
        R = max(R, count_totals(P, l, r))

    for i in xrange(min(M, N - 1 - K) + 1):
        r = K + i
        l = max(0, min(K, K - (M - 2 * i)))
        R = max(R, count_totals(P, l, r))

    return R


def main(argv):
    print solution([2, 3, 7, 5, 1, 3, 9], 4, 6)


if __name__ == "__main__":
    main(sys.argv[1:])
