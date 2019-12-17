import unittest

from lessons.sorting.max_product_of_three import solution


class TestMaxProductOfThree(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([-3, 1, 2, -2, 5, 6]), 60)
        self.assertEqual(solution([-5, 5, -5, 4]),       125)


if __name__ == '__main__':
    unittest.main()
