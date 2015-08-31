import unittest

from lessons.counting_elements.frog_river_one import solution


class TestFrogRiverOne(unittest.TestCase):

    def test_basic_case(self):
        self.assertEqual(solution(5, [1, 3, 1, 4, 2, 3, 5, 4]), 6)


if __name__ == '__main__':
    unittest.main()
