import unittest

from lessons.prefix_sums.min_avg_two_slice import solution


class TestMinAvgTwoSlice(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([4, 2, 2, 5, 1, 5, 8]), 1)


if __name__ == '__main__':
    unittest.main()
