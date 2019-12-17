import sys


'''
    https://codility.com/demo/results/demoHZ4MVA-7PC/

'''


def solution(S, P, Q):
    N = len(S)
    M = len(P)

    T = [[0 for _ in xrange(N + 1)] for _ in xrange(3)]
    A = []

    for i in xrange(N):
        T[0][i + 1] = T[0][i] + (S[i] == 'A')
        T[1][i + 1] = T[1][i] + (S[i] == 'C')
        T[2][i + 1] = T[2][i] + (S[i] == 'G')

    for i in xrange(M):
        if   T[0][Q[i] + 1] - T[0][P[i]] > 0: A.append(1)
        elif T[1][Q[i] + 1] - T[1][P[i]] > 0: A.append(2)
        elif T[2][Q[i] + 1] - T[2][P[i]] > 0: A.append(3)
        else: A.append(4)

    return A


def main(argv):
    print solution('CAGCCTA', [2, 5, 0], [4, 5, 6])
    print solution('A', [0], [0])
    print solution('GT', [0, 0, 1], [0, 1, 1])


if __name__ == "__main__":
    main(sys.argv[1:])
