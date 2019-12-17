import sys


'''
    https://codility.com/demo/results/demoE5BDD6-ZJJ/

'''


def solution(A):
    T = 0
    W = 0

    for a in reversed(A):
        if a == 0:
            T += W
        else:
            W += 1

    return T if T <= 1000000000 else -1


def main(argv):
    print solution([0, 1, 0, 1, 1])


if __name__ == "__main__":
    main(sys.argv[1:])
