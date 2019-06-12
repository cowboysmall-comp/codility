import sys

'''
    https://app.codility.com/c/feedback/NDJ749-X8Y/
'''

def solution(S):
    try:

        stack = []
        for s in S:
            if s == '+':
                stack.append(stack.pop() + stack.pop())
            elif s == '*':
                stack.append(stack.pop() * stack.pop())
            else:
                stack.append(int(s))

        return stack.pop()

    except:
        return -1



def main(argv):
    print(solution("13+62*7+*"))
    print()

    print(solution("11++"))
    print()



if __name__ == "__main__":
    main(sys.argv[1:])
