import unittest

from lessons.prefix_sums.count_div import solution


class TestCountDiv(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution(6, 11, 2),    3)
        self.assertEqual(solution(11, 345, 17), 20)


if __name__ == '__main__':
    unittest.main()
