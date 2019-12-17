import unittest

from lessons.prefix_sums.passing_cars import solution


class TestPassingCars(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution([0, 1, 0, 1, 1]), 5)


if __name__ == '__main__':
    unittest.main()
