import sys

'''
    https://codility.com/demo/results/demoKGJF8A-EPR/

'''


def solution(X, Y, D):
    return ((Y - X) // D) + (1 if (Y - X) % D > 0 else 0)


def main(argv):
    print solution(10, 85, 30)


if __name__ == "__main__":
    main(sys.argv[1:])
