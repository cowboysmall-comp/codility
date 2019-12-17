import unittest

from demos.equi import solution


class TestEqui(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([-1, 3, -4, 5, 1, -6, 2, 1]), 1)


if __name__ == '__main__':
    unittest.main()
